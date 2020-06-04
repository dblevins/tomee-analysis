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
public class TreeWizard$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$1", null, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$Visitor", null);

classWriter.visitOuterClass("org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard", "find", "(Ljava/lang/Object;I)Ljava/util/List;");

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$Visitor", "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard", "Visitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$nodes", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard;Ljava/util/List;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$1", "this$0", "Lorg/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$1", "val$nodes", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$Visitor", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/libraries/antlr/runtime/tree/TreeWizard$1", "val$nodes", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
