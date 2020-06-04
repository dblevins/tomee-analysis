package asm.org.eclipse.persistence.sdo;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class SDOConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/SDOConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_PREFIX", "Ljava/lang/String;", null, "sdo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_PREFIX", "Ljava/lang/String;", null, "sdoXML");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_PREFIX", "Ljava/lang/String;", null, "sdoJava");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_URL", "Ljava/lang/String;", null, "commonj.sdo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_URL", "Ljava/lang/String;", null, "commonj.sdo/xml");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_URL", "Ljava/lang/String;", null, "commonj.sdo/java");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORACLE_SDO_URL", "Ljava/lang/String;", null, "org.eclipse.persistence.sdo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIMETYPE_URL", "Ljava/lang/String;", null, "http://www.w3.org/2005/05/xmlmime");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID_PROPERTY_NAME", "Ljava/lang/String;", null, "id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOLEAN", "Ljava/lang/String;", null, "Boolean");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BYTE", "Ljava/lang/String;", null, "Byte");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BYTES", "Ljava/lang/String;", null, "Bytes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHANGESUMMARY", "Ljava/lang/String;", null, "ChangeSummaryType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER", "Ljava/lang/String;", null, "Character");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATE", "Ljava/lang/String;", null, "Date");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATAOBJECT", "Ljava/lang/String;", null, "DataObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATETIME", "Ljava/lang/String;", null, "DateTime");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DAY", "Ljava/lang/String;", null, "Day");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DECIMAL", "Ljava/lang/String;", null, "Decimal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE", "Ljava/lang/String;", null, "Double");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DURATION", "Ljava/lang/String;", null, "Duration");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT", "Ljava/lang/String;", null, "Float");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INT", "Ljava/lang/String;", null, "Int");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTEGER", "Ljava/lang/String;", null, "Integer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONG", "Ljava/lang/String;", null, "Long");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MONTH", "Ljava/lang/String;", null, "Month");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MONTHDAY", "Ljava/lang/String;", null, "MonthDay");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OBJECT", "Ljava/lang/String;", null, "Object");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROPERTY", "Ljava/lang/String;", null, "Property");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHORT", "Ljava/lang/String;", null, "Short");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STRING", "Ljava/lang/String;", null, "String");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STRINGS", "Ljava/lang/String;", null, "Strings");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIME", "Ljava/lang/String;", null, "Time");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE", "Ljava/lang/String;", null, "Type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "YEAR", "Ljava/lang/String;", null, "Year");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "YEARMONTH", "Ljava/lang/String;", null, "YearMonth");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "YEARMONTHDAY", "Ljava/lang/String;", null, "YearMonthDay");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "URI", "Ljava/lang/String;", null, "URI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOLEANOBJECT", "Ljava/lang/String;", null, "BooleanObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BYTEOBJECT", "Ljava/lang/String;", null, "ByteObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTEROBJECT", "Ljava/lang/String;", null, "CharacterObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLEOBJECT", "Ljava/lang/String;", null, "DoubleObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOATOBJECT", "Ljava/lang/String;", null, "FloatObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTOBJECT", "Ljava/lang/String;", null, "IntObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONGOBJECT", "Ljava/lang/String;", null, "LongObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHORTOBJECT", "Ljava/lang/String;", null, "ShortObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLHELPER_LOAD_OPTIONS", "Ljava/lang/String;", null, "LoadOptions");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_LOAD_OPTION", "Ljava/lang/String;", null, "type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTACHMENT_MARSHALLER_OPTION", "Ljava/lang/String;", null, "attachmentMarshaller");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTACHMENT_UNMARSHALLER_OPTION", "Ljava/lang/String;", null, "attachmentUnmarshaller");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOLEAN_DEFAULT", "Ljava/lang/Boolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BYTE_DEFAULT", "Ljava/lang/Byte;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARACTER_DEFAULT", "Ljava/lang/Character;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE_DEFAULT", "Ljava/lang/Double;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT_DEFAULT", "Ljava/lang/Float;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTEGER_DEFAULT", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONG_DEFAULT", "Ljava/lang/Long;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHORT_DEFAULT", "Ljava/lang/Short;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_BOOLEAN", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_BYTE", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_BYTES", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_CHARACTER", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_DATE", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_DATETIME", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_DAY", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_DECIMAL", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_DOUBLE", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_DURATION", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_FLOAT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_INT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_INTEGER", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_LONG", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_MONTH", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_MONTHDAY", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_OBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_SHORT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_STRING", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_STRINGS", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_TIME", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_YEAR", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_YEARMONTH", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_YEARMONTHDAY", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_URI", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_BOOLEANOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_BYTEOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_CHARACTEROBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_DOUBLEOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_FLOATOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_INTOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_LONGOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_SHORTOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANY_TYPE", "Ljava/lang/String;", null, "anyType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANY_URI", "Ljava/lang/String;", null, "anyURI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTAINMENT", "Ljava/lang/String;", null, "containment");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_DURATION", "Ljava/lang/String;", null, "duration");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENTITIES", "Ljava/lang/String;", null, "ENTITIES");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENTITY", "Ljava/lang/String;", null, "ENTITY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GDAY", "Ljava/lang/String;", null, "gDay");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GMONTH", "Ljava/lang/String;", null, "gMonth");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GMONTHDAY", "Ljava/lang/String;", null, "gMonthDay");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GYEAR", "Ljava/lang/String;", null, "gYear");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GYEARMONTH", "Ljava/lang/String;", null, "gYearMonth");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID", "Ljava/lang/String;", null, "ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IDREF", "Ljava/lang/String;", null, "IDREF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IDREFS", "Ljava/lang/String;", null, "IDREFS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LANGUAGE", "Ljava/lang/String;", null, "language");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAME", "Ljava/lang/String;", null, "Name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NCNAME", "Ljava/lang/String;", null, "NCName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NEGATIVEINTEGER", "Ljava/lang/String;", null, "negativeInteger");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POSITIVEINTEGER", "Ljava/lang/String;", null, "positiveInteger");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NMTOKEN", "Ljava/lang/String;", null, "NMTOKEN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NMTOKENS", "Ljava/lang/String;", null, "NMTOKENS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONNEGATIVEINTEGER", "Ljava/lang/String;", null, "nonNegativeInteger");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONPOSITIVEINTEGER", "Ljava/lang/String;", null, "nonPositiveInteger");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NORMALIZEDSTRING", "Ljava/lang/String;", null, "normalizedString");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOTATION", "Ljava/lang/String;", null, "NOTATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN", "Ljava/lang/String;", null, "token");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNSIGNEDLONG", "Ljava/lang/String;", null, "unsignedLong");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANY_TYPE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANY_URI_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENTITIES_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENTITY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DURATION_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GDAY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GMONTH_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GMONTHDAY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GYEAR_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GYEARMONTH_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IDREF_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IDREFS_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LANGUAGE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAME_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NCNAME_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NEGATIVEINTEGER_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POSITIVEINTEGER_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NMTOKEN_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NMTOKENS_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONNEGATIVEINTEGER_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONPOSITIVEINTEGER_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NORMALIZEDSTRING_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOTATION_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKEN_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNSIGNEDLONG_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_MIME_TYPE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIMETYPE_NAME", "Ljava/lang/String;", null, "mimeTypeProperty");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_MIME_TYPE_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOCUMENTATION", "Ljava/lang/String;", null, "documentation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPINFO", "Ljava/lang/String;", null, "appinfo");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_ALIASNAME", "Ljava/lang/String;", null, "aliasName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_NAME", "Ljava/lang/String;", null, "name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_PROPERTYTYPE", "Ljava/lang/String;", null, "propertyType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_OPPOSITEPROPERTY", "Ljava/lang/String;", null, "oppositeProperty");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_SEQUENCE", "Ljava/lang/String;", null, "sequence");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_READONLY", "Ljava/lang/String;", null, "readOnly");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_DATATYPE", "Ljava/lang/String;", null, "dataType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_STRING_NAME", "Ljava/lang/String;", null, "string");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_MANY", "Ljava/lang/String;", null, "many");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLELEMENT_PROPERTY_NAME", "Ljava/lang/String;", null, "xmlElement");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_MANY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_ALIASNAME_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_NAME_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_SEQUENCE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_READONLY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_DATATYPE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_STRING_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_PROPERTYTYPE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOXML_OPPOSITEPROPERTY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_ELEMENT_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLELEMENT_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SDOJAVA_PACKAGE", "Ljava/lang/String;", null, "package");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_INSTANCECLASS", "Ljava/lang/String;", null, "instanceClass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_EXTENDEDINSTANCECLASS", "Ljava/lang/String;", null, "extendedInstanceClass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_NESTEDINTERFACES", "Ljava/lang/String;", null, "nestedInterfaces");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_PACKAGE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_INSTANCECLASS_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_EXTENDEDINSTANCECLASS_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDOJAVA_NESTEDINTERFACES_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIME_TYPE_PROPERTY_NAME", "Ljava/lang/String;", null, "mimeType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIME_TYPE_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIME_TYPE_PROPERTY_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_SCHEMA_TYPE_NAME", "Ljava/lang/String;", null, "xmlSchemaType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOCUMENTATION_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVACLASS_PROPERTY_NAME", "Ljava/lang/String;", null, "javaClass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_CLASS_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPINFO_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIME_TYPE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIME_TYPE_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_TYPE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_CLASS_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_DATATYPE_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_ID_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOCUMENTATION_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPINFO_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVADOC_START", "Ljava/lang/String;", null, "/**");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVADOC_LINE", "Ljava/lang/String;", null, " * ");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVADOC_END", "Ljava/lang/String;", null, " */");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_PACKAGE_NAME_SEPARATOR", "Ljava/lang/String;", null, ".");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_TYPEGENERATION_DEFAULT_PACKAGE_NAME", "Ljava/lang/String;", null, "defaultPackage");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_TYPEGENERATION_NO_NAMESPACE", "Ljava/lang/String;", null, "noNamespace");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_IMPL_NAME", "Ljava/lang/String;", null, "Impl");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "javaReservedWordsList", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "sdoInterfaceReservedWordsList", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHANGESUMMARY_REF", "Ljava/lang/String;", null, "ref");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHANGESUMMARY_UNSET", "Ljava/lang/String;", null, "unset");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_HELPER_CONTEXT", "Ljava/lang/String;", null, "sdoHelperContext");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPINFO_SOURCE_ATTRIBUTE", "Ljava/lang/String;", null, "source");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_STRING", "Ljava/lang/String;", null, "");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_ISSET_METHOD_NAME", "Ljava/lang/String;", null, "isSet");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_CHANGESUMMARY_REF_PATH_PREFIX", "Ljava/lang/String;", null, "#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_CHANGESUMMARY_REF_PATH_PREFIX_LENGTH", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_DATA_OBJECT_IMPL_CLASS_NAME", "Ljava/lang/String;", null, "org.eclipse.persistence.sdo.SDODataObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASSLOADER_WEB_FRAGMENT", "Ljava/lang/String;", null, ".web.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASSLOADER_EJB_FRAGMENT", "Ljava/lang/String;", null, ".wrappers");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASSLOADER_OC4J_FRAGMENT", "Ljava/lang/String;", null, "oc4j:");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_XPATH_NS_SEPARATOR_FRAGMENT", "Ljava/lang/String;", null, ":");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_XPATH_SEPARATOR_FRAGMENT", "Ljava/lang/String;", null, "/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_XPATH_LIST_INDEX_OPEN_BRACKET", "Ljava/lang/String;", null, "[");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_XPATH_LIST_INDEX_CLOSE_BRACKET", "Ljava/lang/String;", null, "]");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_XPATH_TO_ROOT", "Ljava/lang/String;", null, "/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_XPATH_INVALID_PATH", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_TYPE_GENERATION_DEFAULT_PACKAGE_NAME_SEARCH", "Ljava/lang/String;", null, "defaultPackage.");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "commonj/sdo/impl/HelperProvider", "getDefaultContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getTypeHelper", "()Lcommonj/sdo/helper/TypeHelper;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/SDOTypeHelper");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"commonj/sdo/helper/HelperContext", "org/eclipse/persistence/sdo/helper/SDOTypeHelper"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "BOOLEAN_DEFAULT", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "BYTE_DEFAULT", "Ljava/lang/Byte;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "CHARACTER_DEFAULT", "Ljava/lang/Character;");
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "DOUBLE_DEFAULT", "Ljava/lang/Double;");
methodVisitor.visitInsn(FCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "FLOAT_DEFAULT", "Ljava/lang/Float;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "INTEGER_DEFAULT", "Ljava/lang/Integer;");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "LONG_DEFAULT", "Ljava/lang/Long;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SHORT_DEFAULT", "Ljava/lang/Short;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Boolean");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PBOOLEAN", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "BOOLEAN_DEFAULT", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_BOOLEAN", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Byte");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PBYTE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "BYTE_DEFAULT", "Ljava/lang/Byte;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_BYTE", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Bytes");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "APBYTE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_BYTES", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Character");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PCHAR", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "CHARACTER_DEFAULT", "Ljava/lang/Character;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_CHARACTER", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Date");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "UTILDATE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_DATE", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("DateTime");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_DATETIME", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Day");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_DAY", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Decimal");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BIGDECIMAL", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_DECIMAL", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Double");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PDOUBLE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "DOUBLE_DEFAULT", "Ljava/lang/Double;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_DOUBLE", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Duration");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_DURATION", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Float");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PFLOAT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "FLOAT_DEFAULT", "Ljava/lang/Float;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_FLOAT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Int");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PINT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "INTEGER_DEFAULT", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_INT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Integer");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BIGINTEGER", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_INTEGER", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Long");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PLONG", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "LONG_DEFAULT", "Ljava/lang/Long;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_LONG", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Month");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_MONTH", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("MonthDay");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_MONTHDAY", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Object");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "OBJECT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_OBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Short");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "PSHORT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SHORT_DEFAULT", "Ljava/lang/Short;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_SHORT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("String");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_STRING", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Strings");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "List_Class", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_STRINGS", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Time");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_TIME", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("Year");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_YEAR", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("YearMonth");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_YEARMONTH", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("YearMonthDay");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_YEARMONTHDAY", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("URI");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "STRING", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_URI", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("BooleanObject");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BOOLEAN", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_BOOLEANOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("ByteObject");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "BYTE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_BYTEOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("CharacterObject");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "CHAR", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_CHARACTEROBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("DoubleObject");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "DOUBLE", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_DOUBLEOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("FloatObject");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "FLOAT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_FLOATOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("IntObject");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "INTEGER", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_INTOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("LongObject");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "LONG", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_LONGOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/types/SDODataType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("ShortObject");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "SHORT", "Ljava/lang/Class;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/types/SDODataType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_SHORTOBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("anyType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "ANY_TYPE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("anyURI");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "ANY_URI_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("ENTITIES");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "ENTITIES_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("ENTITY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "ENTITY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("duration");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "DURATION_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("gDay");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "GDAY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("gMonth");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "GMONTH_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("gMonthDay");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "GMONTHDAY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("gYear");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "GYEAR_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("gYearMonth");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "GYEARMONTH_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("ID");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "ID_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("IDREF");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "IDREF_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("IDREFS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "IDREFS_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("language");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "LANGUAGE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("Name");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NAME_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("NCName");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NCNAME_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("negativeInteger");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NEGATIVEINTEGER_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("positiveInteger");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "POSITIVEINTEGER_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("NMTOKEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NMTOKEN_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("NMTOKENS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NMTOKENS_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("nonNegativeInteger");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NONNEGATIVEINTEGER_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("nonPositiveInteger");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NONPOSITIVEINTEGER_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("normalizedString");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NORMALIZEDSTRING_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("NOTATION");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "NOTATION_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("token");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "TOKEN_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("unsignedLong");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "UNSIGNEDLONG_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2005/05/xmlmime");
methodVisitor.visitLdcInsn("expectedContentTypes");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "XML_MIME_TYPE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitLdcInsn("mimeTypeProperty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "XML_MIME_TYPE_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitLdcInsn("id");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "ID_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("many");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_MANY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("aliasName");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_ALIASNAME_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_NAME_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("sequence");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_SEQUENCE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("readOnly");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_READONLY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("dataType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_DATATYPE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("string");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_STRING_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("propertyType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_PROPERTYTYPE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("oppositeProperty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOXML_OPPOSITEPROPERTY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("xmlElement");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "XML_ELEMENT_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitLdcInsn("xmlElement");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_BOOLEAN", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOProperty", "<init>", "(Lcommonj/sdo/helper/HelperContext;Ljava/lang/String;Lorg/eclipse/persistence/sdo/SDOType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "XMLELEMENT_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("package");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOJAVA_PACKAGE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("instanceClass");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOJAVA_INSTANCECLASS_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("extendedInstanceClass");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOJAVA_EXTENDEDINSTANCECLASS_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("nestedInterfaces");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDOJAVA_NESTEDINTERFACES_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitLdcInsn("mimeType");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_STRING", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOProperty", "<init>", "(Lcommonj/sdo/helper/HelperContext;Ljava/lang/String;Lorg/eclipse/persistence/sdo/SDOType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "MIME_TYPE_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitLdcInsn("mimeTypeProperty");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_STRING", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOProperty", "<init>", "(Lcommonj/sdo/helper/HelperContext;Ljava/lang/String;Lorg/eclipse/persistence/sdo/SDOType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "MIME_TYPE_PROPERTY_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitLdcInsn("documentation");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_STRING", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOProperty", "<init>", "(Lcommonj/sdo/helper/HelperContext;Ljava/lang/String;Lorg/eclipse/persistence/sdo/SDOType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "DOCUMENTATION_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitLdcInsn("javaClass");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_STRING", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOProperty", "<init>", "(Lcommonj/sdo/helper/HelperContext;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/sdo/SDOType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "JAVA_CLASS_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitLdcInsn("id");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_STRING", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOProperty", "<init>", "(Lcommonj/sdo/helper/HelperContext;Ljava/lang/String;Lorg/eclipse/persistence/sdo/SDOType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "ID_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sdo/SDOProperty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "globalHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitLdcInsn("appinfo");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_OBJECT", "Lorg/eclipse/persistence/sdo/SDOType;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/SDOProperty", "<init>", "(Lcommonj/sdo/helper/HelperContext;Ljava/lang/String;Lorg/eclipse/persistence/sdo/SDOType;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "APPINFO_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "MIME_TYPE_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOProperty", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "MIME_TYPE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "MIME_TYPE_PROPERTY_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOProperty", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "MIME_TYPE_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitLdcInsn("xmlSchemaType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SCHEMA_TYPE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/java");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "JAVA_CLASS_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOProperty", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "JAVA_CLASS_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("commonj.sdo/xml");
methodVisitor.visitLdcInsn("dataType");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "XML_DATATYPE_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "ID_PROPERTY", "Lorg/eclipse/persistence/sdo/SDOProperty;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDOProperty", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "XML_ID_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitLdcInsn("documentation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "DOCUMENTATION_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.eclipse.persistence.sdo");
methodVisitor.visitLdcInsn("appinfo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "APPINFO_PROPERTY_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("class");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "javaReservedWordsList", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("ChangeSummary");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("Container");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ContainmentProperty");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("DataGraph");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("InstanceProperties");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("RootObject");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("Sequence");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("Type");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoInterfaceReservedWordsList", "[Ljava/lang/String;");
methodVisitor.visitLdcInsn("#");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_CHANGESUMMARY_REF_PATH_PREFIX_LENGTH", "I");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "SDO_XPATH_INVALID_PATH", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sdo/SDOConstants", "sdoTypeHelper", "Lorg/eclipse/persistence/sdo/helper/SDOTypeHelper;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sdo/helper/SDOTypeHelper", "reset", "()V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
