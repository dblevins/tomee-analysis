package asm.org.apache.openjpa.meta;
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
public class MultiQueryMetaData$Parameter$ModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "Ljava/lang/Enum<Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openjpa/meta/MultiQueryMetaData$Parameter", "org/apache/openjpa/meta/MultiQueryMetaData", "Parameter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "org/apache/openjpa/meta/MultiQueryMetaData$Parameter", "Mode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IN", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUT", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INOUT", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CURSOR", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "$VALUES", "[Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "IN", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "OUT", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INOUT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "INOUT", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CURSOR");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "CURSOR", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "IN", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "OUT", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "INOUT", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "CURSOR", "Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode", "$VALUES", "[Lorg/apache/openjpa/meta/MultiQueryMetaData$Parameter$Mode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
