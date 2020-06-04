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
public class ClassInfoImpl$SecondaryAnnotationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "Ljava/lang/Enum<Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "com/sun/xml/bind/v2/model/impl/ClassInfoImpl", "SecondaryAnnotation", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JAVA_TYPE", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ID_IDREF", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINARY", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEMENT_WRAPPER", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LIST", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SCHEMA_TYPE", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "bitMask", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "members", "[Ljava/lang/Class;", "[Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "$VALUES", "[Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "<init>", "(Ljava/lang/String;II[Ljava/lang/Class;)V", "(I[Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "bitMask", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "members", "[Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAVA_TYPE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/adapters/XmlJavaTypeAdapter;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "<init>", "(Ljava/lang/String;II[Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "JAVA_TYPE", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ID_IDREF");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/XmlID;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/XmlIDREF;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "<init>", "(Ljava/lang/String;II[Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "ID_IDREF", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINARY");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/XmlInlineBinaryData;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/XmlMimeType;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/XmlAttachmentRef;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "<init>", "(Ljava/lang/String;II[Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "BINARY", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEMENT_WRAPPER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/XmlElementWrapper;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "<init>", "(Ljava/lang/String;II[Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "ELEMENT_WRAPPER", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LIST");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/XmlList;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "<init>", "(Ljava/lang/String;II[Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "LIST", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SCHEMA_TYPE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/bind/annotation/XmlSchemaType;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "<init>", "(Ljava/lang/String;II[Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "SCHEMA_TYPE", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "JAVA_TYPE", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "ID_IDREF", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "BINARY", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "ELEMENT_WRAPPER", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "LIST", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "SCHEMA_TYPE", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation", "$VALUES", "[Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$SecondaryAnnotation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
