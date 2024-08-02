package com.br.pecas.controller;

import com.br.pecas.model.Cliente;
import com.br.pecas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientWebController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/new")
    public String createClienteForm(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente_form";
    }

    @PostMapping("/salve")
    public String saveCliente(Cliente cliente, Model model) {
        Cliente saveCliente = clienteService.saveCliente(cliente);
        model.addAttribute("cliente", saveCliente);
        clienteService.saveCliente(cliente);
        return "cliente_detail";
    }

    @GetMapping("/list")
    public String lisCliente(Model model) {
        model.addAttribute("clientes", clienteService.getAllClientes());
        return "cliente_list";
    }

    @GetMapping("/{id}")
    public String getClientByIdPublic(@PathVariable Long id, Model model) {
        Cliente cliente = clienteService.getClienteById(id).orElse(null);
        model.addAttribute("client", cliente);
        return "client_detail";
    }
}
