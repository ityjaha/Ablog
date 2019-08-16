<template>
  <div id="app">
    <Bar></Bar>
    <Container></Container>
  </div>
</template>

<script>
  import Container from './views/Container'
  import Bar from './views/Bar'
export default {
   components:{
    Container,Bar,
   },
  name: 'App'
}
</script>
<style>
 html,body{
  border:none;
  margin:0;
  padding:0;
 }
</style>
