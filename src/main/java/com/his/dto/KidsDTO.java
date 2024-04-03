package com.his.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KidsDTO {
	
	private Integer appNumber;
	private List<KidDTO> kids;
	
}
