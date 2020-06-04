package asm.org.apache.tomee.microprofile.jwt;
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
public class JWTLogCategoriesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomee/microprofile/jwt/JWTLogCategories", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "JWT", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONFIG", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEYS", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINT", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENS", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENS_ENCODED", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOKENS_DECODED", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("microprofile");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitLdcInsn("jwt");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "JWT", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "JWT", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("configuration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "CONFIG", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "CONFIG", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("keys");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "KEYS", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "JWT", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("validation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "VALIDATION", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "VALIDATION", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("constraint");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "CONSTRAINT", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "JWT", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("tokens");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "TOKENS", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "TOKENS", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("encoded");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "TOKENS_ENCODED", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "TOKENS", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("decoded");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/microprofile/jwt/JWTLogCategories", "TOKENS_DECODED", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
