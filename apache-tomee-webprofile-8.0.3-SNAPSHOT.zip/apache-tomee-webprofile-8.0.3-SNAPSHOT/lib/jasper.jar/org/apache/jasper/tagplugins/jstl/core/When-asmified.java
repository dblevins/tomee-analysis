package asm.org.apache.jasper.tagplugins.jstl.core;
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
public class WhenDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/jasper/tagplugins/jstl/core/When", null, "java/lang/Object", new String[] { "org/apache/jasper/compiler/tagplugin/TagPlugin" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doTag", "(Lorg/apache/jasper/compiler/tagplugin/TagPluginContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "getParentContext", "()Lorg/apache/jasper/compiler/tagplugin/TagPluginContext;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "dontUseTagPlugin", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/jasper/compiler/tagplugin/TagPluginContext"}, 0, null);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("hasBeenHere");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "getPluginAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("} else if(");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "generateJavaSource", "(Ljava/lang/String;)V", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("if(");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "generateJavaSource", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("hasBeenHere");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "setPluginAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("test");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "generateAttribute", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("){");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "generateJavaSource", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/jasper/compiler/tagplugin/TagPluginContext", "generateBody", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
