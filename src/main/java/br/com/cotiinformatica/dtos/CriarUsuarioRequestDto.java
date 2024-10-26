package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CriarUsuarioRequestDto {
	
	@Size(min= 8, max = 100, message= "por favor, infome o nome de 8 a 100 caracteres.")
	@NotEmpty(message= "por favor, informe o nome do usuario.")
	private String nome;
	
	@Email(message= "por favor, informe um email valido")
	@NotEmpty(message= "por favor, informe o email do usuario.")
	private String email;

	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$", 
			message = "Por favor, informe a senha com letras maiúsculas, minúsculas, números, símbolos e pelo menos 8 caracteres.")
	@NotEmpty(message = "Por favor, informe a senha do usuário.")
	private String senha;
}
