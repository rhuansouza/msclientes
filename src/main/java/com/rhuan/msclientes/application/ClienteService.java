package com.rhuan.msclientes.application;

import com.rhuan.msclientes.domain.Cliente;
import com.rhuan.msclientes.infra.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }

    public Optional<Cliente> getByCPF(String cpf){
        return repository.findByCpf(cpf);
    }
}
