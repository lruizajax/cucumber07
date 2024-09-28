
package com.store.stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.store.factory.RegisterPage;
import com.store.util.Base;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class RegisterSteps extends Base {

	RegisterPage account = new RegisterPage(returnDriver());
	Faker fake = new Faker(new Locale("en-US"));

	@Dado("que el usuario está en la página de registro")
	public void que_el_usuario_está_en_la_página_de_registro() {
		account.goToRegisterPage();
	}

	@Cuando("el usuario completa la información válida")
	public void el_usuario_completa_la_información_válida() {
		String pass = fake.internet().password();
		String email = fake.internet().emailAddress();
		account.fillOutRegisterForm(fake.name().firstName(), fake.name().lastName(), email, pass, pass);
		System.out.println("Account has been created with Email:" + email + " and Password: " + pass);
	}

	@Cuando("el usuario hace clic en el boton de registrar")
	public void el_usuario_hace_clic_en_el_boton_de_registrar() {
		account.sendDataForNewAccount();
	}

	@Entonces("el sistema debe mostrarle mensaje de registro exitoso")
	public void el_sistema_debe_mostrarle_mensaje_de_registro_exitoso() {
		assertTrue(account.getMessage().contains("Your registration completed"));
	}

	@Cuando("el usuario completa el formulario de registro con información válida, incluyendo detalles opcionales")
	public void el_usuario_completa_el_formulario_de_registro_con_información_válida_incluyendo_detalles_opcionales() {
	}

	@Cuando("el usuario intenta registrarse sin completar todos los campos obligatorios")
	public void el_usuario_intenta_registrarse_sin_completar_todos_los_campos_obligatorios() {
	}

	@Dado("el usuario elige una contraseña débil")
	public void el_usuario_elige_una_contraseña_débil() {
	}

	@Dado("el usuario ingresa una contraseña y una confirmación de contraseña que no coinciden")
	public void el_usuario_ingresa_una_contraseña_y_una_confirmación_de_contraseña_que_no_coinciden() {

	}

	@Dado("el correo electrónico ya está registrado en el sistema")
	public void el_correo_electrónico_ya_está_registrado_en_el_sistema() {
	}

	@Entonces("el sistema debe mostrar un mensaje indicando que todos los campos obligatorios deben ser llenados")
	public void el_sistema_debe_mostrar_un_mensaje_indicando_que_todos_los_campos_obligatorios_deben_ser_llenados() {
	}

	@Cuando("el usuario intenta registrarse con esa contraseña")
	public void el_usuario_intenta_registrarse_con_esa_contraseña() {
	}

	@Cuando("el usuario intenta registrarse con ese correo electrónico")
	public void el_usuario_intenta_registrarse_con_ese_correo_electrónico() {
	}

	@Cuando("el usuario intenta registrarse con esas contraseñas")
	public void el_usuario_intenta_registrarse_con_esas_contraseñas() {
	}

	@Cuando("hace clic en el botón de registro")
	public void hace_clic_en_el_botón_de_registro() {
	}

	@Entonces("el sistema debe mostrar un mensaje indicando que la contraseña es débil y debe contener al menos X caracteres, letras y números")
	public void el_sistema_debe_mostrar_un_mensaje_indicando_que_la_contraseña_es_débil_y_debe_contener_al_menos_x_caracteres_letras_y_números() {
	}

	@Entonces("el usuario debe ser redirigido a la página de inicio de sesión")
	public void el_usuario_debe_ser_redirigido_a_la_página_de_inicio_de_sesión() {
	}

	@Entonces("el sistema debe mostrar un mensaje indicando que las contraseñas no coinciden")
	public void el_sistema_debe_mostrar_un_mensaje_indicando_que_las_contraseñas_no_coinciden() {
	}

	@Entonces("el sistema debe mostrar un mensaje de error indicando que el correo electrónico ya está en uso")
	public void el_sistema_debe_mostrar_un_mensaje_de_error_indicando_que_el_correo_electrónico_ya_está_en_uso() {
	}

	@Entonces("recibir un mensaje de confirmación de registro")
	public void recibir_un_mensaje_de_confirmación_de_registro() {
	}
}
