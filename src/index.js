import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import './website.css';
import Websites from './components/Websites';
import Create from './components/Create';
import Update from './components/Update';
import {register} from './serviceWorker';
ReactDOM.render(
	<Router>
		<div>
			<Route exact path='/' component={Websites} />
			<Route path='/create' component={Create} />
			<Route path='/update/:id' component={Update} />
		</div>
	</Router>,
document.getElementById('root'));

register();