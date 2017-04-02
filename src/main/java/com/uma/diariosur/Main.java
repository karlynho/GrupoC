/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uma.diariosur;

import javax.persistence.Persistence;

/**
 *
 * @author Steven
 */
public class Main {
    public static void main(String[] args) {
    Persistence.generateSchema("com.uma_DiarioSur_jar_1.0-SNAPSHOTPU", null);
  }
}
