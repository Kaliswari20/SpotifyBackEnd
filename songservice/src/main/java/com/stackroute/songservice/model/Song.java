/*
 * Author Name: Kaliswari
 * Date: 21/01/2023
 * Created With: IntelliJ IDEA Community Edition
 */
package com.stackroute.songservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Document
@Data
public class Music {
    private String artistName;
    private String songName;
}
