package com.avs.lojainfo.infra.data.repositories.interfaces;

import org.springframework.stereotype.Repository;
import com.avs.lojainfo.domain.model.Produto;

@Repository
//@Primary
public interface IProdutoRepository extends IBaseRepository<Produto, Integer> {
	
}