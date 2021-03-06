package org.hl7.fhir.instance.model.valuesets;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Jul 14, 2015 17:35-0400 for FHIR v0.5.0


public enum PractitionerRole {

        /**
         * null
         */
        DOCTOR, 
        /**
         * null
         */
        NURSE, 
        /**
         * null
         */
        PHARMACIST, 
        /**
         * null
         */
        RESEARCHER, 
        /**
         * null
         */
        TEACHER, 
        /**
         * null
         */
        ICT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static PractitionerRole fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("doctor".equals(codeString))
          return DOCTOR;
        if ("nurse".equals(codeString))
          return NURSE;
        if ("pharmacist".equals(codeString))
          return PHARMACIST;
        if ("researcher".equals(codeString))
          return RESEARCHER;
        if ("teacher".equals(codeString))
          return TEACHER;
        if ("ict".equals(codeString))
          return ICT;
        throw new Exception("Unknown PractitionerRole code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case DOCTOR: return "doctor";
            case NURSE: return "nurse";
            case PHARMACIST: return "pharmacist";
            case RESEARCHER: return "researcher";
            case TEACHER: return "teacher";
            case ICT: return "ict";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/practitioner-role";
        }
        public String getDefinition() {
          switch (this) {
            case DOCTOR: return "";
            case NURSE: return "";
            case PHARMACIST: return "";
            case RESEARCHER: return "";
            case TEACHER: return "";
            case ICT: return "";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case DOCTOR: return "doctor";
            case NURSE: return "nurse";
            case PHARMACIST: return "pharmacist";
            case RESEARCHER: return "researcher";
            case TEACHER: return "Teacher/educator";
            case ICT: return "ICT professional";
            default: return "?";
          }
    }


}

