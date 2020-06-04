package asm.org.apache.commons.codec.language;
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
public class DaitchMokotoffSoundex$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "org/apache/commons/codec/language/DaitchMokotoffSoundex$1", "Ljava/lang/Object;Ljava/util/Comparator<Lorg/apache/commons/codec/language/DaitchMokotoffSoundex$Rule;>;", "java/lang/Object", new String[] { "java/util/Comparator" });

classWriter.visitOuterClass("org/apache/commons/codec/language/DaitchMokotoffSoundex", null, null);

classWriter.visitInnerClass("org/apache/commons/codec/language/DaitchMokotoffSoundex$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/codec/language/DaitchMokotoffSoundex$Rule", "org/apache/commons/codec/language/DaitchMokotoffSoundex", "Rule", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/apache/commons/codec/language/DaitchMokotoffSoundex$Rule;Lorg/apache/commons/codec/language/DaitchMokotoffSoundex$Rule;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/DaitchMokotoffSoundex$Rule", "getPatternLength", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/DaitchMokotoffSoundex$Rule", "getPatternLength", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/codec/language/DaitchMokotoffSoundex$Rule");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/codec/language/DaitchMokotoffSoundex$Rule");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/codec/language/DaitchMokotoffSoundex$1", "compare", "(Lorg/apache/commons/codec/language/DaitchMokotoffSoundex$Rule;Lorg/apache/commons/codec/language/DaitchMokotoffSoundex$Rule;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
