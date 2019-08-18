<template>
    <div id="">
		<el-breadcrumb separator="/">
		  <el-breadcrumb-item :to="{ path: '/' }">Ablog</el-breadcrumb-item>
		  <el-breadcrumb-item><a href="/">博客管理</a></el-breadcrumb-item>
		  <el-breadcrumb-item>创建文章</el-breadcrumb-item>
		</el-breadcrumb>
		<el-divider></el-divider>
		<el-form :model="articles" :rules="rules" ref="articlesRuleForm" label-width="80px" @submit.native.prevent="articlesInsert('articlesRuleForm')">
		  <el-form-item label="标题" prop="title">
		    <el-input v-model="articles.title"></el-input>
		  </el-form-item>
		  <el-form-item label="摘要" prop="summary">
		    <el-input type="textarea" v-model="articles.summary"></el-input>
		  </el-form-item>
		  <el-form-item label="内容" prop="content">
		  	<vue-editor v-model="articles.content"  useCustomImageHandler 
		  	@imageAdded="handleImageAdded"></vue-editor>
		  </el-form-item>
		  <el-form-item>
		    <el-button type="primary" native-type="submit">立即创建</el-button>
		    <el-button>取消</el-button>
		  </el-form-item>
		</el-form>
    </div>
</template>
<script>
  import { VueEditor } from "vue2-editor";
  export default {
  	 components: {
	    VueEditor
	  },
    data() {
      var validateTitle = (rule, value, callback) => {
        if (!value || value === '') {
          callback(new Error(" "));
        }else{
          callback();
        }
      };
      var validateSummary = (rule, value, callback) => {
        if (!value || value === '') {
          callback(new Error(' '));
        }else{
          callback();
        }
      };
      var validateContent = (rule, value, callback) => {
        if (!value || value === '') {
          callback(new Error(' '));
        }else{
          callback();
        }
      };
      return {
        articles: {
          id:null,
          title: null,
          summary: null,
          content:null
        },
        rules: {
          title: [
            { required: true,validator: validateTitle, trigger: 'blur' }
          ],
          summary: [
            { required: true,validator: validateSummary, trigger: 'blur' }
          ],
          content: [
            { required: true,validator: validateContent, trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      articlesInsert(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
	          this.$http.post('/articles/insert',this.articles).then(res=>{
	  				this.id=res.data;
	  			})
          } else {
            alert('error submit!!');
            return false;
          }
        });
      },
      handleImageAdded(file, Editor, cursorLocation, resetUploader){
	      var formData = new FormData();
	      formData.append("file", file);
	      this.$http.post('/articles/upload',formData).then(res=>{
  				let url = res.data;
  				Editor.insertEmbed(cursorLocation, "image", this.$http.defaults.baseURL+url);
          		resetUploader();
  			})
      }
    }
  }
</script>