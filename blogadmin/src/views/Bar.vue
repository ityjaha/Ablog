<template>
    <el-card id="bar">
		<el-dropdown>
          <i class="el-icon-user-solid" style="margin-right: 15px"></i>
        </el-dropdown>
        <span clas="bar-title">Ablog</span>
    </el-card>
</template>
<script>
      export default {
        name: '',
        components: {
    
    
            }
      }
</script>
<style>
	#bar{
		height:80px;
		background-color:#545c64;
		margin:0;
		padding:0;
		border:none;
		border-radius: 0px;
		color: #eee
	}
	.el-dropdown{
		font-size: 30px;
		color:#eee;
	}
	.bar-title{
		font-size: 40px;
		font-family: Times New Roman
	}
</style>