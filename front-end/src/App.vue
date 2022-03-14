<template>
  <div id="app">
<!--    <div id="nav">-->
<!--      <router-link to="/">Home</router-link> |-->
<!--      <router-link to="/about">About</router-link>-->
<!--    </div>-->
<!--    <router-view/>-->
<!--      <div>-->
        <b-navbar type="dark" variant="dark">
          <b-navbar-nav>
            <b-nav-item href="/"><router-link to="/">Home</router-link></b-nav-item>
            <b-nav-item href="/about"><router-link to="/about">About</router-link></b-nav-item>
            <!-- Navbar dropdowns -->
<!--            <b-nav-item-dropdown text="Lang" right>-->
<!--              <b-dropdown-item href="#">EN</b-dropdown-item>-->
<!--              <b-dropdown-item href="#">ES</b-dropdown-item>-->
<!--              <b-dropdown-item href="#">RU</b-dropdown-item>-->
<!--              <b-dropdown-item href="#">FA</b-dropdown-item>-->
<!--            </b-nav-item-dropdown>-->
          </b-navbar-nav>
        </b-navbar>
      </div>
<!--  </div>-->
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

b-nav-item  {
  padding: 30px;
}

b-nav-item  {
  font-weight: bold;
  color: #2c3e50;
}

b-nav-item  a.router-link-exact-active {
  color: #42b983;
}
</style>
