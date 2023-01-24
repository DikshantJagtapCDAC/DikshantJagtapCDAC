package org.fi.restjpa.RestJPA.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.fi.restjpa.RestJPA.dto.UsersDTO;
import org.fi.restjpa.RestJPA.entity.Users;
import org.fi.restjpa.RestJPA.repository.UsersRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService 
{
	@Autowired
	UsersRepository usersRepository;

	@Override
	public boolean addNewUser(UsersDTO Users) {
try {
			
			Users entityUsers = new Users();
			BeanUtils.copyProperties(Users, entityUsers);
			usersRepository.save(entityUsers);
			
			return true;
			}catch(Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public List<UsersDTO> allUsers() {
		List<Users> listEntity = usersRepository.findAll();
		List<UsersDTO> listDTO = new ArrayList<>();
		
		for(Users entity : listEntity)
		{
			UsersDTO dto = new UsersDTO();
			BeanUtils.copyProperties(entity, dto);
			listDTO.add(dto);
		}
		
		return listDTO;
	}

	@Override
	public UsersDTO findByUserName(String UserName) {
		
		Optional<Users> optUsers = usersRepository.findById(UserName);
		Users entity = optUsers.get();
		
		UsersDTO dto = new UsersDTO();
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
	}

}
