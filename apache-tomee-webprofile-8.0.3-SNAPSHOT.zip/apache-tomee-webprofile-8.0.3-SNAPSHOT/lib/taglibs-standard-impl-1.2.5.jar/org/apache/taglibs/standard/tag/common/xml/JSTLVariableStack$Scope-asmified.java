package asm.org.apache.taglibs.standard.tag.common.xml;
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
public class JSTLVariableStack$ScopeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "Ljava/lang/Enum<Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack", "Scope", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARAM", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEADER", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COOKIE", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INITPARAM", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PAGE", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SESSION", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "APPLICATION", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "$VALUES", "[Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARAM");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "PARAM", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEADER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "HEADER", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COOKIE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "COOKIE", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INITPARAM");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "INITPARAM", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PAGE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "PAGE", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "REQUEST", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SESSION");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "SESSION", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("APPLICATION");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "APPLICATION", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "PARAM", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "HEADER", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "COOKIE", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "INITPARAM", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "PAGE", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "REQUEST", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "SESSION", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "APPLICATION", "Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope", "$VALUES", "[Lorg/apache/taglibs/standard/tag/common/xml/JSTLVariableStack$Scope;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
