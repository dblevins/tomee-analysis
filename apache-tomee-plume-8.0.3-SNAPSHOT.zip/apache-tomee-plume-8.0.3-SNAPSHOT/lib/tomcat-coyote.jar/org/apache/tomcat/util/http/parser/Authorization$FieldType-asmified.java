package asm.org.apache.tomcat.util.http.parser;
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
public class Authorization$FieldTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "Ljava/lang/Enum<Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/util/http/parser/Authorization$FieldType", "org/apache/tomcat/util/http/parser/Authorization", "FieldType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TOKEN_OR_QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LHEX", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUOTED_TOKEN", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "$VALUES", "[Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/http/parser/Authorization$FieldType");
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/Authorization$FieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUOTED_STRING");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/Authorization$FieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TOKEN_OR_QUOTED_STRING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "TOKEN_OR_QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/Authorization$FieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LHEX");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "LHEX", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/http/parser/Authorization$FieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUOTED_TOKEN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_TOKEN", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/http/parser/Authorization$FieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "TOKEN_OR_QUOTED_STRING", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "LHEX", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "QUOTED_TOKEN", "Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/http/parser/Authorization$FieldType", "$VALUES", "[Lorg/apache/tomcat/util/http/parser/Authorization$FieldType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
