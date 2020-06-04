package asm.org.eclipse.persistence.internal.libraries.antlr.runtime.tree;
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
public class TreeWizard$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$ContextVisitor" });

classWriter.visitOuterClass("org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard", "visit", "(Ljava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$ContextVisitor;)V");

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$TreePattern", "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard", "TreePattern", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$ContextVisitor", "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard", "ContextVisitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$labels", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$tpattern", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$TreePattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$visitor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$ContextVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard;Ljava/util/Map;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$TreePattern;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$ContextVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "this$0", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "val$labels", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "val$tpattern", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$TreePattern;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "val$visitor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$ContextVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljava/lang/Object;Ljava/lang/Object;ILjava/util/Map;)V", "(Ljava/lang/Object;Ljava/lang/Object;ILjava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "val$labels", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "this$0", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "val$tpattern", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$TreePattern;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "val$labels", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard", "_parse", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$TreePattern;Ljava/util/Map;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "val$visitor", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$ContextVisitor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$3", "val$labels", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$ContextVisitor", "visit", "(Ljava/lang/Object;Ljava/lang/Object;ILjava/util/Map;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
