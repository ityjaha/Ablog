<template>
	<div>
		<el-breadcrumb separator="/">
		  <el-breadcrumb-item :to="{ path: '/' }">Ablog</el-breadcrumb-item>
		  <el-breadcrumb-item><a href="/">博客管理</a></el-breadcrumb-item>
		  <el-breadcrumb-item>文章列表</el-breadcrumb-item>
		</el-breadcrumb>
		<el-divider></el-divider>
	    <el-form :inline="true" :model="articles" class="articles-query">
		  <el-form-item label="标题">
		    <el-input v-model="articles.title"></el-input>
		  </el-form-item>
		  <el-form-item label="摘要">
		    <el-input v-model="articles.summary"></el-input>
		  </el-form-item>
		  <el-form-item label="创建时间" >
		   <el-date-picker type="date" v-model="articles.predate" style="width: 100%;" value-format="yyyy-MM-dd"></el-date-picker>
		  </el-form-item>
		  <!-- <el-form-item label="活动区域">
		    <el-select v-model="formInline.region" placeholder="活动区域">
		      <el-option label="区域一" value="shanghai"></el-option>
		      <el-option label="区域二" value="beijing"></el-option>
		    </el-select>
		  </el-form-item> -->
		  <el-form-item>
		    <el-button type="primary" @click="onSubmit">查询</el-button>
		  </el-form-item>
		</el-form>
		<!-- <el-divider></el-divider> -->
      <el-table :data="articlesList" stripe border>
      	 <el-table-column type="index" width="50" label="序号"/>
        <el-table-column prop="title" label="标题" width="140"/>
        <el-table-column prop="user.nickname" label="作者" width="80"/>
        <el-table-column prop="summary" label="摘要" width="120"/>
        <el-table-column prop="content" label="内容"/>
        <el-table-column prop="browsedList.length" label="浏览次数"  width="100"/>
        <el-table-column prop="predate" label="创建时间"  width="180"/>
        <el-table-column
	      fixed="right"
	      label="操作"
	      width="100"
	      >
	      <template slot-scope="scope">
	        <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
	        <el-button type="text" size="small">编辑</el-button>
	      </template>
	    </el-table-column>
      </el-table>
  </div>
</template>
<script>
      export default {
        name: '',
        components: {
    
            },
        data() {
	      return {
	        articlesList:null,
	        articles: {
	          title: null,
	          summary: null,
	          predate:null
	        }
	      }
   	 	},
   	 	created(){
   	 		this.$http.get('/articles/list').then(res=>{
  				this.articlesList=res.data
  			})
   	 	}, 
	    methods: {
	      onSubmit() {
	        console.log(this.articles);
	        console.log(this.articlesList);
	      }
	    }
      }
</script>
<style>
.articles-query{
	/*background-color: #eee;*/
	/*line-height: 100px*/
}
.el-divider--horizontal{
	margin-top: 4px;
}
</style>