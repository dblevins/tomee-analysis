package asm.org.eclipse.persistence.internal.libraries.asm.xml;
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
public class ASMContentHandler$LocalVariableAnnotationRuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", null, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$Rule", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler", "LocalVariableAnnotationRule", ACC_FINAL);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$Rule", "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler", "Rule", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", "this$0", "Lorg/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$Rule", "<init>", "(Lorg/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "begin", "(Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("desc");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("visible");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Ljava/lang/String;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("typeRef");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("typePath");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/libraries/asm/TypePath", "fromString", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/libraries/asm/TypePath;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("start");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/libraries/asm/Label");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", "java/lang/String", "org/xml/sax/Attributes", "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, "org/eclipse/persistence/internal/libraries/asm/TypePath", "[Ljava/lang/String;", "[Lorg/eclipse/persistence/internal/libraries/asm/Label;", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", "getLabel", "(Ljava/lang/Object;)Lorg/eclipse/persistence/internal/libraries/asm/Label;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("end");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/libraries/asm/Label");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 11);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/String;", "[Lorg/eclipse/persistence/internal/libraries/asm/Label;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", "getLabel", "(Ljava/lang/Object;)Lorg/eclipse/persistence/internal/libraries/asm/Label;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(11, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("index");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 13);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/String;", "[I", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitIincInsn(13, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", "this$0", "Lorg/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", "this$0", "Lorg/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler", "peek", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/MethodVisitor");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/MethodVisitor", "visitLocalVariableAnnotation", "(ILorg/eclipse/persistence/internal/libraries/asm/TypePath;[Lorg/eclipse/persistence/internal/libraries/asm/Label;[Lorg/eclipse/persistence/internal/libraries/asm/Label;[ILjava/lang/String;Z)Lorg/eclipse/persistence/internal/libraries/asm/AnnotationVisitor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "end", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler$LocalVariableAnnotationRule", "this$0", "Lorg/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/xml/ASMContentHandler", "pop", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/libraries/asm/AnnotationVisitor");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/asm/AnnotationVisitor", "visitEnd", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/libraries/asm/AnnotationVisitor"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
