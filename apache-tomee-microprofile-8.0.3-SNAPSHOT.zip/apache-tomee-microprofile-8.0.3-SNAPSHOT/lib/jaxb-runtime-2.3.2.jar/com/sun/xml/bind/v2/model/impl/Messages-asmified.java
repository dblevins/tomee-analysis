package asm.com.sun.xml.bind.v2.model.impl;
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
public class MessagesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/xml/bind/v2/model/impl/Messages", "Ljava/lang/Enum<Lcom/sun/xml/bind/v2/model/impl/Messages;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ID_MUST_BE_STRING", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MUTUALLY_EXCLUSIVE_ANNOTATIONS", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DUPLICATE_ANNOTATIONS", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_DEFAULT_CONSTRUCTOR", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CANT_HANDLE_INTERFACE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CANT_HANDLE_INNER_CLASS", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANNOTATION_ON_WRONG_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GETTER_SETTER_INCOMPATIBLE_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DUPLICATE_ENTRY_IN_PROP_ORDER", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DUPLICATE_PROPERTIES", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XML_ELEMENT_MAPPING_ON_NON_IXMLELEMENT_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SCOPE_IS_NOT_COMPLEXTYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONFLICTING_XML_ELEMENT_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REFERENCE_TO_NON_ELEMENT", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NON_EXISTENT_ELEMENT_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TWO_ATTRIBUTE_WILDCARDS", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUPER_CLASS_HAS_WILDCARD", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_ATTRIBUTE_WILDCARD_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROPERTY_MISSING_FROM_ORDER", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROPERTY_ORDER_CONTAINS_UNUSED_ENTRY", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_XML_ENUM_VALUE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_IMAGE_WRITER", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ILLEGAL_MIME_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ILLEGAL_ANNOTATION", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MULTIPLE_VALUE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEMENT_AND_VALUE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONFLICTING_XML_TYPE_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLVALUE_IN_DERIVED_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SIMPLE_TYPE_IS_REQUIRED", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROPERTY_COLLISION", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_IDREF", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID_XML_ELEMENT_REF", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_XML_ELEMENT_DECL", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XML_ELEMENT_WRAPPER_ON_NON_COLLECTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANNOTATION_NOT_ALLOWED", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLLIST_NEEDS_SIMPLETYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLLIST_ON_SINGLE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_FACTORY_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACTORY_CLASS_NEEDS_FACTORY_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCOMPATIBLE_API_VERSION", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INCOMPATIBLE_API_VERSION_MUSTANG", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RUNNING_WITH_1_0_RUNTIME", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MISSING_JAXB_PROPERTIES", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRANSIENT_FIELD_NOT_BINDABLE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "THERE_MUST_BE_VALUE_IN_XMLVALUE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNMATCHABLE_ADAPTER", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANONYMOUS_ARRAY_ITEM", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCESSORFACTORY_INSTANTIATION_EXCEPTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCESSORFACTORY_ACCESS_EXCEPTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CUSTOM_ACCESSORFACTORY_PROPERTY_ERROR", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CUSTOM_ACCESSORFACTORY_FIELD_ERROR", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLGREGORIANCALENDAR_INVALID", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLGREGORIANCALENDAR_SEC", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLGREGORIANCALENDAR_MIN", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLGREGORIANCALENDAR_HR", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLGREGORIANCALENDAR_DAY", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLGREGORIANCALENDAR_MONTH", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLGREGORIANCALENDAR_YEAR", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XMLGREGORIANCALENDAR_TIMEZONE", "Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "rb", "Ljava/util/ResourceBundle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "$VALUES", "[Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/xml/bind/v2/model/impl/Messages;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/model/impl/Messages;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/model/impl/Messages;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/Messages", "format", "([Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "format", "([Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "rb", "Ljava/util/ResourceBundle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/Messages", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ID_MUST_BE_STRING");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ID_MUST_BE_STRING", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MUTUALLY_EXCLUSIVE_ANNOTATIONS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "MUTUALLY_EXCLUSIVE_ANNOTATIONS", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DUPLICATE_ANNOTATIONS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "DUPLICATE_ANNOTATIONS", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_DEFAULT_CONSTRUCTOR");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NO_DEFAULT_CONSTRUCTOR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CANT_HANDLE_INTERFACE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CANT_HANDLE_INTERFACE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CANT_HANDLE_INNER_CLASS");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CANT_HANDLE_INNER_CLASS", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANNOTATION_ON_WRONG_METHOD");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ANNOTATION_ON_WRONG_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GETTER_SETTER_INCOMPATIBLE_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "GETTER_SETTER_INCOMPATIBLE_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DUPLICATE_ENTRY_IN_PROP_ORDER");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "DUPLICATE_ENTRY_IN_PROP_ORDER", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DUPLICATE_PROPERTIES");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "DUPLICATE_PROPERTIES", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XML_ELEMENT_MAPPING_ON_NON_IXMLELEMENT_METHOD");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XML_ELEMENT_MAPPING_ON_NON_IXMLELEMENT_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SCOPE_IS_NOT_COMPLEXTYPE");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "SCOPE_IS_NOT_COMPLEXTYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONFLICTING_XML_ELEMENT_MAPPING");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CONFLICTING_XML_ELEMENT_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REFERENCE_TO_NON_ELEMENT");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "REFERENCE_TO_NON_ELEMENT", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NON_EXISTENT_ELEMENT_MAPPING");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NON_EXISTENT_ELEMENT_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TWO_ATTRIBUTE_WILDCARDS");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "TWO_ATTRIBUTE_WILDCARDS", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUPER_CLASS_HAS_WILDCARD");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "SUPER_CLASS_HAS_WILDCARD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_ATTRIBUTE_WILDCARD_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INVALID_ATTRIBUTE_WILDCARD_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROPERTY_MISSING_FROM_ORDER");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "PROPERTY_MISSING_FROM_ORDER", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROPERTY_ORDER_CONTAINS_UNUSED_ENTRY");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "PROPERTY_ORDER_CONTAINS_UNUSED_ENTRY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_XML_ENUM_VALUE");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INVALID_XML_ENUM_VALUE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_IMAGE_WRITER");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NO_IMAGE_WRITER", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ILLEGAL_MIME_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ILLEGAL_MIME_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ILLEGAL_ANNOTATION");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ILLEGAL_ANNOTATION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MULTIPLE_VALUE_PROPERTY");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "MULTIPLE_VALUE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEMENT_AND_VALUE_PROPERTY");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ELEMENT_AND_VALUE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONFLICTING_XML_TYPE_MAPPING");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CONFLICTING_XML_TYPE_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLVALUE_IN_DERIVED_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLVALUE_IN_DERIVED_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIMPLE_TYPE_IS_REQUIRED");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "SIMPLE_TYPE_IS_REQUIRED", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROPERTY_COLLISION");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "PROPERTY_COLLISION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_IDREF");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INVALID_IDREF", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID_XML_ELEMENT_REF");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INVALID_XML_ELEMENT_REF", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_XML_ELEMENT_DECL");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NO_XML_ELEMENT_DECL", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XML_ELEMENT_WRAPPER_ON_NON_COLLECTION");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XML_ELEMENT_WRAPPER_ON_NON_COLLECTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANNOTATION_NOT_ALLOWED");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ANNOTATION_NOT_ALLOWED", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLLIST_NEEDS_SIMPLETYPE");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLLIST_NEEDS_SIMPLETYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLLIST_ON_SINGLE_PROPERTY");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLLIST_ON_SINGLE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_FACTORY_METHOD");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NO_FACTORY_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACTORY_CLASS_NEEDS_FACTORY_METHOD");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "FACTORY_CLASS_NEEDS_FACTORY_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCOMPATIBLE_API_VERSION");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INCOMPATIBLE_API_VERSION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INCOMPATIBLE_API_VERSION_MUSTANG");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INCOMPATIBLE_API_VERSION_MUSTANG", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RUNNING_WITH_1_0_RUNTIME");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "RUNNING_WITH_1_0_RUNTIME", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISSING_JAXB_PROPERTIES");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "MISSING_JAXB_PROPERTIES", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRANSIENT_FIELD_NOT_BINDABLE");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "TRANSIENT_FIELD_NOT_BINDABLE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("THERE_MUST_BE_VALUE_IN_XMLVALUE");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "THERE_MUST_BE_VALUE_IN_XMLVALUE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNMATCHABLE_ADAPTER");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "UNMATCHABLE_ADAPTER", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANONYMOUS_ARRAY_ITEM");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ANONYMOUS_ARRAY_ITEM", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCESSORFACTORY_INSTANTIATION_EXCEPTION");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ACCESSORFACTORY_INSTANTIATION_EXCEPTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCESSORFACTORY_ACCESS_EXCEPTION");
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ACCESSORFACTORY_ACCESS_EXCEPTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CUSTOM_ACCESSORFACTORY_PROPERTY_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CUSTOM_ACCESSORFACTORY_PROPERTY_ERROR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CUSTOM_ACCESSORFACTORY_FIELD_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CUSTOM_ACCESSORFACTORY_FIELD_ERROR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLGREGORIANCALENDAR_INVALID");
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_INVALID", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLGREGORIANCALENDAR_SEC");
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_SEC", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLGREGORIANCALENDAR_MIN");
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_MIN", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLGREGORIANCALENDAR_HR");
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_HR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLGREGORIANCALENDAR_DAY");
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_DAY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLGREGORIANCALENDAR_MONTH");
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_MONTH", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLGREGORIANCALENDAR_YEAR");
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_YEAR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLGREGORIANCALENDAR_TIMEZONE");
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/Messages", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_TIMEZONE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/bind/v2/model/impl/Messages");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ID_MUST_BE_STRING", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "MUTUALLY_EXCLUSIVE_ANNOTATIONS", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "DUPLICATE_ANNOTATIONS", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NO_DEFAULT_CONSTRUCTOR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CANT_HANDLE_INTERFACE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CANT_HANDLE_INNER_CLASS", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ANNOTATION_ON_WRONG_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "GETTER_SETTER_INCOMPATIBLE_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "DUPLICATE_ENTRY_IN_PROP_ORDER", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "DUPLICATE_PROPERTIES", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XML_ELEMENT_MAPPING_ON_NON_IXMLELEMENT_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "SCOPE_IS_NOT_COMPLEXTYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CONFLICTING_XML_ELEMENT_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "REFERENCE_TO_NON_ELEMENT", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NON_EXISTENT_ELEMENT_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "TWO_ATTRIBUTE_WILDCARDS", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "SUPER_CLASS_HAS_WILDCARD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INVALID_ATTRIBUTE_WILDCARD_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "PROPERTY_MISSING_FROM_ORDER", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "PROPERTY_ORDER_CONTAINS_UNUSED_ENTRY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INVALID_XML_ENUM_VALUE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NO_IMAGE_WRITER", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ILLEGAL_MIME_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ILLEGAL_ANNOTATION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "MULTIPLE_VALUE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ELEMENT_AND_VALUE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CONFLICTING_XML_TYPE_MAPPING", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLVALUE_IN_DERIVED_TYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "SIMPLE_TYPE_IS_REQUIRED", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "PROPERTY_COLLISION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INVALID_IDREF", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INVALID_XML_ELEMENT_REF", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NO_XML_ELEMENT_DECL", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XML_ELEMENT_WRAPPER_ON_NON_COLLECTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ANNOTATION_NOT_ALLOWED", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLLIST_NEEDS_SIMPLETYPE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLLIST_ON_SINGLE_PROPERTY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "NO_FACTORY_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "FACTORY_CLASS_NEEDS_FACTORY_METHOD", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INCOMPATIBLE_API_VERSION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "INCOMPATIBLE_API_VERSION_MUSTANG", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "RUNNING_WITH_1_0_RUNTIME", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "MISSING_JAXB_PROPERTIES", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "TRANSIENT_FIELD_NOT_BINDABLE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "THERE_MUST_BE_VALUE_IN_XMLVALUE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "UNMATCHABLE_ADAPTER", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ANONYMOUS_ARRAY_ITEM", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ACCESSORFACTORY_INSTANTIATION_EXCEPTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "ACCESSORFACTORY_ACCESS_EXCEPTION", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CUSTOM_ACCESSORFACTORY_PROPERTY_ERROR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "CUSTOM_ACCESSORFACTORY_FIELD_ERROR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_INVALID", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_SEC", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_MIN", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_HR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_DAY", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_MONTH", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_YEAR", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "XMLGREGORIANCALENDAR_TIMEZONE", "Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "$VALUES", "[Lcom/sun/xml/bind/v2/model/impl/Messages;");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/model/impl/Messages;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/ResourceBundle", "getBundle", "(Ljava/lang/String;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/Messages", "rb", "Ljava/util/ResourceBundle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
