<template>
	<el-form :model="user" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" @submit.native.prevent="login('ruleForm')">
	  <el-form-item label="用户名" prop="username">
	    <el-input v-model="user.username" autocomplete="off"></el-input>
	  </el-form-item>
	  <el-form-item label="密码" prop="password">
	    <el-input type="password" v-model="user.password" autocomplete="off"></el-input>
	  </el-form-item>
	  <el-form-item>
	    <el-button type="primary" native-type="submit">登录</el-button>
	    <el-button @click="resetForm('ruleForm')">重置</el-button>
	  </el-form-item>
	</el-form>
</template>
<script>
  export default {
    data() {
      var validateUsername = (rule, value, callback) => {
        if (!value || value === '') {
          callback(new Error('请输入用户名'));
        }else{
          callback();
        }
      };
      var validatePass = (rule, value, callback) => {
        if (!value || value === '') {
          callback(new Error('请输入密码'));
        }else{
          callback();
        }
      };
      return {
        user: {
          username: '',
          password: ''
        },
        rules: {
          username: [
            { validator: validateUsername, trigger: 'blur' }
          ],
          password: [
            { validator: validatePass, trigger: 'blur' }
          ]
        }
      };
    },
    methods: {
      login(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
	          this.$http.post('/login',this.user).then(res=>{
	  				const user = res.data;
	  				if(user){
              this.$storeLocal.set('user',user);
	  					this.$router.push({path:'/home'});
	  				}else{
	  					this.$message.error('用户名或密码错误！');
	  				}
	  			})
          } else {
            alert('error submit!!');
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>