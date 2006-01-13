/*
 * Copyright (c) 2000-2004 by JetBrains s.r.o. All Rights Reserved.
 * Use is subject to license terms.
 */
package com.intellij.psi.xml;

import com.intellij.psi.JavaTokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.tree.xml.IXmlLeafElementType;

public interface XmlTokenType {
  IElementType XML_START_TAG_START = new IXmlLeafElementType("XML_START_TAG_START");
  IElementType XML_END_TAG_START = new IXmlLeafElementType("XML_END_TAG_START");
  IElementType XML_TAG_END = new IXmlLeafElementType("XML_TAG_END");
  IElementType XML_EMPTY_ELEMENT_END = new IXmlLeafElementType("XML_EMPTY_ELEMENT_END");
  IElementType XML_TAG_NAME = new IXmlLeafElementType("XML_TAG_NAME");
  IElementType XML_NAME = new IXmlLeafElementType("XML_NAME");
  IElementType XML_ATTRIBUTE_VALUE_TOKEN = new IXmlLeafElementType("XML_ATTRIBUTE_VALUE_TOKEN");
  IElementType XML_ATTRIBUTE_VALUE_START_DELIMITER = new IXmlLeafElementType("XML_ATTRIBUTE_VALUE_START_DELIMITER");
  IElementType XML_ATTRIBUTE_VALUE_END_DELIMITER = new IXmlLeafElementType("XML_ATTRIBUTE_VALUE_END_DELIMITER");
  IElementType XML_EQ = new IXmlLeafElementType("XML_EQ");
  IElementType XML_DATA_CHARACTERS = new IXmlLeafElementType("XML_DATA_CHARACTERS");
  IElementType XML_WHITE_SPACE = JavaTokenType.WHITE_SPACE;
  IElementType XML_REAL_WHITE_SPACE = new IXmlLeafElementType("XML_WHITE_SPACE");
  IElementType XML_COMMENT_START = new IXmlLeafElementType("XML_COMMENT_START");
  IElementType XML_COMMENT_END = new IXmlLeafElementType("XML_COMMENT_END");
  IElementType XML_COMMENT_CHARACTERS = new IXmlLeafElementType("XML_COMMENT_CHARACTERS");

  IElementType XML_DECL_START = new IXmlLeafElementType("XML_DECL_START");
  IElementType XML_DECL_END = new IXmlLeafElementType("XML_DECL_END");

  IElementType XML_DOCTYPE_START = new IXmlLeafElementType("XML_DOCTYPE_START");
  IElementType XML_DOCTYPE_END = new IXmlLeafElementType("XML_DOCTYPE_END");
  IElementType XML_DOCTYPE_SYSTEM = new IXmlLeafElementType("XML_DOCTYPE_SYSTEM");
  IElementType XML_DOCTYPE_PUBLIC = new IXmlLeafElementType("XML_DOCTYPE_PUBLIC");

  IElementType XML_MARKUP_START = new IXmlLeafElementType("XML_MARKUP_START");
  IElementType XML_MARKUP_END = new IXmlLeafElementType("XML_MARKUP_END");

  IElementType XML_CDATA_START = new IXmlLeafElementType("XML_CDATA_START");
  IElementType XML_CONDITIONAL_SECTION_START = new IXmlLeafElementType("XML_CONDITIONAL_SECTION_START");
  IElementType XML_CONDITIONAL_INCLUDE = new IXmlLeafElementType("XML_CONDITIONAL_INCLUDE");
  IElementType XML_CONDITIONAL_IGNORE = new IXmlLeafElementType("XML_CONDITIONAL_IGNORE");
  IElementType XML_CDATA_END = new IXmlLeafElementType("XML_CDATA_END");
  IElementType XML_CONDITIONAL_SECTION_END = new IXmlLeafElementType("XML_CONDITIONAL_SECTION_END");

  IElementType XML_ELEMENT_DECL_START = new IXmlLeafElementType("XML_ELEMENT_DECL_START");
  IElementType XML_NOTATION_DECL_START = new IXmlLeafElementType("XML_NOTATION_DECL_START");
  IElementType XML_ATTLIST_DECL_START = new IXmlLeafElementType("XML_ATTLIST_DECL_START");
  IElementType XML_ENTITY_DECL_START = new IXmlLeafElementType("XML_ENTITY_DECL_START");

  IElementType XML_PCDATA = new IXmlLeafElementType("XML_PCDATA");
  IElementType XML_LEFT_PAREN = new IXmlLeafElementType("XML_LEFT_PAREN");
  IElementType XML_RIGHT_PAREN = new IXmlLeafElementType("XML_RIGHT_PAREN");
  IElementType XML_CONTENT_EMPTY = new IXmlLeafElementType("XML_CONTENT_EMPTY");
  IElementType XML_CONTENT_ANY = new IXmlLeafElementType("XML_CONTENT_ANY");
  IElementType XML_QUESTION = new IXmlLeafElementType("XML_QUESTION");
  IElementType XML_STAR = new IXmlLeafElementType("XML_STAR");
  IElementType XML_PLUS = new IXmlLeafElementType("XML_PLUS");
  IElementType XML_BAR = new IXmlLeafElementType("XML_BAR");
  IElementType XML_COMMA = new IXmlLeafElementType("XML_COMMA");
  IElementType XML_AMP = new IXmlLeafElementType("XML_AMP");
  IElementType XML_SEMI = new IXmlLeafElementType("XML_SEMI");
  IElementType XML_PERCENT = new IXmlLeafElementType("XML_PERCENT");

  IElementType XML_ATT_IMPLIED = new IXmlLeafElementType("XML_ATT_IMPLIED");
  IElementType XML_ATT_REQUIRED = new IXmlLeafElementType("XML_ATT_REQUIRED");
  IElementType XML_ATT_FIXED = new IXmlLeafElementType("XML_ATT_FIXED");

  IElementType XML_ENTITY_REF_TOKEN = new IXmlLeafElementType("XML_ENTITY_REF_TOKEN");

  IElementType TAG_WHITE_SPACE = new IXmlLeafElementType("TAG_WHITE_SPACE");

  IElementType XML_PI_START = new IXmlLeafElementType("XML_PI_START");
  IElementType XML_PI_END = new IXmlLeafElementType("XML_PI_END");
  IElementType XML_PI_TARGET = new IXmlLeafElementType("XML_PI_TARGET");

  IElementType XML_CHAR_ENTITY_REF = new IXmlLeafElementType("XML_CHAR_ENTITY_REF");

  IElementType XML_BAD_CHARACTER = new IXmlLeafElementType("XML_BAD_CHARACTER");
  IElementType XML_EMBEDDED_CHAMELEON = new IXmlLeafElementType("XML_EMBEDDED_CONTENT");
  IElementType XML_MARKUP_DECL = XmlElementType.XML_MARKUP;

  TokenSet COMMENTS = TokenSet.create(new IElementType[] {XML_COMMENT_START, XML_COMMENT_CHARACTERS, XML_COMMENT_END});
  TokenSet WHITESPACES = TokenSet.create(new IElementType[] {XML_WHITE_SPACE, XML_REAL_WHITE_SPACE});
}
