<template>
  <el-container style="height:100%">
    <el-header>
        <el-row class="demo-avatar demo-basic">
          <el-col :span="21">
            <div>Ablog</div>
          </el-col>
          <el-col :span="3">
            <div class="demo-basic--circle">
              <div class="block head-image">
                <el-link type="primary" :underline="false">{{user.username}}</el-link>
                <el-divider direction="vertical"></el-divider>
                <el-avatar :size="30" fit="fill" :src="circleUrl"></el-avatar>
              </div>
            </div>
          </el-col>  
        </el-row>
    </el-header>
    <el-container>
      <el-aside width="210px">
        <el-menu router :default-openeds="['1']" background-color="#545c64" text-color="#fff"  active-text-color="#ffd04b" :unique-opened=true>
          <el-submenu index="1">
            <template slot="title"> <i class="el-icon-menu"></i>博客管理</template>
              <el-menu-item index="articlesEdit"><i class="el-icon-edit"></i>创建文章</el-menu-item>
              <el-menu-item index="articlesList"><i class="el-icon-tickets"></i>文章列表</el-menu-item>
          </el-submenu>
          <el-submenu index="11">
            <template slot="title"> <i class="el-icon-menu"></i>用户管理</template>
              <el-menu-item index="1-1"><i class="el-icon-edit"></i>创建用户</el-menu-item>
              <el-menu-item index="articlesList"><i class="el-icon-tickets"></i>用户列表</el-menu-item>
          </el-submenu>
          <el-submenu index="2">
            <template slot="title"> <i class="el-icon-menu"></i>评论管理</template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="1-1">选项1</el-menu-item>
              <el-menu-item index="1-2">选项2</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title"> <i class="el-icon-document"></i>分类管理</template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="1-1">选项1</el-menu-item>
              <el-menu-item index="1-2">选项2</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="4">
            <template slot="title">  <i class="el-icon-setting"></i>专栏管理</template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="1-1">选项1</el-menu-item>
              <el-menu-item index="1-2">选项2</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="5">
            <template slot="title">  <i class="el-icon-setting"></i>个人设置</template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="1-1">选项1</el-menu-item>
              <el-menu-item index="1-2">选项2</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="6">
            <template slot="title">  <i class="el-icon-setting"></i>其他设置</template>
            <el-menu-item-group>
              <template slot="title">分组一</template>
              <el-menu-item index="1-1">选项1</el-menu-item>
              <el-menu-item index="1-2">选项2</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
        </el-menu>
      </el-aside>
      <el-main>
        <router-view/>
      </el-main>
    </el-container>
  </el-container>
</template>
<style>
  .el-header {
    background-color:#545c64;
    color: #fff;
    line-height: 60px;
    font-size: 40px;
    font-family: Times New Roman;
  }
  .el-aside {
    color: #333;
    margin-top:2px;
  }
.el-link.el-link--primary{
    font-size: 20px;
    color:#eee;
  }
.head-image .el-divider{
  background-color: #666
}
</style>

<script>
  export default {
    data() {
      return {
        user:{

        },
        circleUrl: "http://localhost:8020/api/image/head.jpg"
      }
    },
    created(){
      this.user = this.$storeLocal.get('user');
    }
  };
</script>