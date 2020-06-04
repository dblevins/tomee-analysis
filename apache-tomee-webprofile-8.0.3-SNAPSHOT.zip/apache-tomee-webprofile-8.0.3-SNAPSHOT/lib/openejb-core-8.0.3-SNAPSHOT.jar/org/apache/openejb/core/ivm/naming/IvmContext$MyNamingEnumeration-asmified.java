package asm.org.apache.openejb.core.ivm.naming;
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
public class IvmContext$MyNamingEnumerationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", null, "java/lang/Object", new String[] { "javax/naming/NamingEnumeration" });

classWriter.visitInnerClass("org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "org/apache/openejb/core/ivm/naming/IvmContext", "MyNamingEnumeration", ACC_PROTECTED | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openejb/core/ivm/naming/NameNode$Federation", "org/apache/openejb/core/ivm/naming/NameNode", "Federation", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "myEnum", "Ljava/util/Enumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/ivm/naming/IvmContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/core/ivm/naming/IvmContext;Lorg/apache/openejb/core/ivm/naming/NameNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "this$0", "Lorg/apache/openejb/core/ivm/naming/IvmContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "java/util/Vector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Vector", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getSubTree", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "org/apache/openejb/core/ivm/naming/IvmContext", "org/apache/openejb/core/ivm/naming/NameNode", "java/util/Vector", "org/apache/openejb/core/ivm/naming/NameNode"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "gatherNodes", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "buildEnumeration", "(Ljava/util/Vector;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "buildEnumeration", "(Ljava/util/Vector;)V", "(Ljava/util/Vector<Lorg/apache/openejb/core/ivm/naming/NameNode;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "gatherNodes", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getLessTree", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "addInListIfNeeded", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getGrtrTree", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "addInListIfNeeded", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getSubTree", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "addInListIfNeeded", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/ivm/naming/NameNode$Federation;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/ivm/naming/NameNode$Federation;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getObject", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/ivm/naming/NameNode$Federation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode$Federation", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/naming/Context");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "this$0", "Lorg/apache/openejb/core/ivm/naming/IvmContext;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/ivm/naming/IvmContext;"));
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/naming/Context"}, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/ivm/naming/IvmContext;"));
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/ivm/naming/IvmContext");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext", "mynode", "Lorg/apache/openejb/core/ivm/naming/NameNode;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext", "mynode", "Lorg/apache/openejb/core/ivm/naming/NameNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "contains", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/ivm/naming/IvmContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext", "mynode", "Lorg/apache/openejb/core/ivm/naming/NameNode;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext", "mynode", "Lorg/apache/openejb/core/ivm/naming/NameNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getGrtrTree", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "addInListIfNeeded", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext", "mynode", "Lorg/apache/openejb/core/ivm/naming/NameNode;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext", "mynode", "Lorg/apache/openejb/core/ivm/naming/NameNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getLessTree", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "addInListIfNeeded", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext", "mynode", "Lorg/apache/openejb/core/ivm/naming/NameNode;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext", "mynode", "Lorg/apache/openejb/core/ivm/naming/NameNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getSubTree", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "addInListIfNeeded", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addInListIfNeeded", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "contains", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "isMyChild", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "gatherNodes", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;Ljava/util/Vector;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isMyChild", "(Lorg/apache/openejb/core/ivm/naming/NameNode;Lorg/apache/openejb/core/ivm/naming/NameNode;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getParent", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getParent", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/NameNode", "getParentTree", "()Lorg/apache/openejb/core/ivm/naming/NameNode;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "myEnum", "Ljava/util/Enumeration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasMore", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "hasMoreElements", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "nextElement", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasMoreElements", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "myEnum", "Ljava/util/Enumeration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Enumeration", "hasMoreElements", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextElement", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/naming/IvmContext$MyNamingEnumeration", "myEnum", "Ljava/util/Enumeration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Enumeration", "nextElement", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
