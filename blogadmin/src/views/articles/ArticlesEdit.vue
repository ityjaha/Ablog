<template>
    <div id="">
		<el-breadcrumb separator="/">
		  <el-breadcrumb-item :to="{ path: '/' }">Ablog</el-breadcrumb-item>
		  <el-breadcrumb-item><a href="/">博客管理</a></el-breadcrumb-item>
		  <el-breadcrumb-item>创建文章</el-breadcrumb-item>
		</el-breadcrumb>
		<el-divider></el-divider>
		<el-form ref="form" :model="articles" label-width="80px">
		  <el-form-item label="标题">
		    <el-input v-model="articles.title"></el-input>
		  </el-form-item>
		  <el-form-item label="摘要">
		    <el-input type="textarea" v-model="articles.summary"></el-input>
		  </el-form-item>
		  <el-form-item label="内容">
		  	<vue-editor v-model="articles.content"  useCustomImageHandler 
		  	@imageAdded="handleImageAdded"></vue-editor>
		  </el-form-item>
		  <el-form-item>
		    <el-button type="primary" @click="onSubmit">立即创建</el-button>
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
      return {
        articles: {
          title: '',
          summary: ''
        }
      }
    },
    methods: {
      onSubmit() {
        console.log(this.articles);
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