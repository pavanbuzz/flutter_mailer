package com.dataxad.flutter_mailer_example;

import android.os.Bundle;
import com.dataxad.flutter_mailer.FlutterMailerPlugin;
import dev.flutter.plugins.e2e.E2EPlugin;
import io.flutter.app.FlutterActivity;

public class EmbeddingV1Activity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FlutterMailerPlugin.registerWith(registrarFor("com.dataxad.flutter_mailer.FlutterMailerPlugin"));
    E2EPlugin.registerWith(registrarFor("dev.flutter.plugins.e2e.E2EPlugin"));
  }
}