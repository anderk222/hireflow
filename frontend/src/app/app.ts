import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

/** Root component: only mounts the router. Real layout lives in `layout/shell`. */
@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.scss'
})
export class App {
}
