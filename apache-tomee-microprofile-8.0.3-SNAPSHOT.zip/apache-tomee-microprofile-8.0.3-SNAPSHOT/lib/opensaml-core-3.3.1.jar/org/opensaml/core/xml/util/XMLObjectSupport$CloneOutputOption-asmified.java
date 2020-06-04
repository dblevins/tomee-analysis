package asm.org.opensaml.core.xml.util;
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
public class XMLObjectSupport$CloneOutputOptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "Ljava/lang/Enum<Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "org/opensaml/core/xml/util/XMLObjectSupport", "CloneOutputOption", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DropDOM", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RootDOMInNewDocument", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UnrootedDOM", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "$VALUES", "[Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption");
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
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DropDOM");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "DropDOM", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RootDOMInNewDocument");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "RootDOMInNewDocument", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UnrootedDOM");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "UnrootedDOM", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "DropDOM", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "RootDOMInNewDocument", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "UnrootedDOM", "Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption", "$VALUES", "[Lorg/opensaml/core/xml/util/XMLObjectSupport$CloneOutputOption;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
