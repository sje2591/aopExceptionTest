package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.MemberDTO;
@Mapper
public interface MemberMapper {
	List<MemberDTO> selectMemberList();
}
