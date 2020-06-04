package asm.org.apache.jasper.compiler;
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
public class Validator$ValidateVisitor$1FVVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", null, "org/apache/jasper/compiler/ELNode$Visitor", null);

classWriter.visitOuterClass("org/apache/jasper/compiler/Validator$ValidateVisitor", "validateFunctions", "(Lorg/apache/jasper/compiler/ELNode$Nodes;Lorg/apache/jasper/compiler/Node;)V");

classWriter.visitInnerClass("org/apache/jasper/compiler/Validator$ValidateVisitor", "org/apache/jasper/compiler/Validator", "ValidateVisitor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", null, "FVVisitor", 0);

classWriter.visitInnerClass("org/apache/jasper/compiler/ELNode$Function", "org/apache/jasper/compiler/ELNode", "Function", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/ELNode$Visitor", "org/apache/jasper/compiler/ELNode", "Visitor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/ELNode$Nodes", "org/apache/jasper/compiler/ELNode", "Nodes", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Root", "org/apache/jasper/compiler/Node", "Root", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "n", "Lorg/apache/jasper/compiler/Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/jasper/compiler/Validator$ValidateVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/jasper/compiler/Validator$ValidateVisitor;Lorg/apache/jasper/compiler/Node;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "this$0", "Lorg/apache/jasper/compiler/Validator$ValidateVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/ELNode$Visitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "n", "Lorg/apache/jasper/compiler/Node;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/jasper/compiler/ELNode$Function;)V", null, new String[] { "org/apache/jasper/JasperException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ELNode$Function", "getPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ELNode$Function", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "n", "Lorg/apache/jasper/compiler/Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node", "getRoot", "()Lorg/apache/jasper/compiler/Node$Root;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Root", "isXmlSyntax", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "this$0", "Lorg/apache/jasper/compiler/Validator$ValidateVisitor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "n", "Lorg/apache/jasper/compiler/Node;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Validator$ValidateVisitor", "access$100", "(Lorg/apache/jasper/compiler/Validator$ValidateVisitor;Ljava/lang/String;Lorg/apache/jasper/compiler/Node;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "this$0", "Lorg/apache/jasper/compiler/Validator$ValidateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Validator$ValidateVisitor", "access$200", "(Lorg/apache/jasper/compiler/Validator$ValidateVisitor;)Lorg/apache/jasper/compiler/PageInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "getURI", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "this$0", "Lorg/apache/jasper/compiler/Validator$ValidateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Validator$ValidateVisitor", "access$300", "(Lorg/apache/jasper/compiler/Validator$ValidateVisitor;)Lorg/apache/jasper/compiler/ErrorDispatcher;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "n", "Lorg/apache/jasper/compiler/Node;");
methodVisitor.visitLdcInsn("jsp.error.attribute.invalidPrefix");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ErrorDispatcher", "jspError", "(Lorg/apache/jasper/compiler/Node;Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "this$0", "Lorg/apache/jasper/compiler/Validator$ValidateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Validator$ValidateVisitor", "access$200", "(Lorg/apache/jasper/compiler/Validator$ValidateVisitor;)Lorg/apache/jasper/compiler/PageInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "getTaglib", "(Ljava/lang/String;)Ljavax/servlet/jsp/tagext/TagLibraryInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/tagext/TagLibraryInfo", "getFunction", "(Ljava/lang/String;)Ljavax/servlet/jsp/tagext/FunctionInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/servlet/jsp/tagext/TagLibraryInfo", "javax/servlet/jsp/tagext/FunctionInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "this$0", "Lorg/apache/jasper/compiler/Validator$ValidateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Validator$ValidateVisitor", "access$300", "(Lorg/apache/jasper/compiler/Validator$ValidateVisitor;)Lorg/apache/jasper/compiler/ErrorDispatcher;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "n", "Lorg/apache/jasper/compiler/Node;");
methodVisitor.visitLdcInsn("jsp.error.noFunction");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ErrorDispatcher", "jspError", "(Lorg/apache/jasper/compiler/Node;Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ELNode$Function", "setUri", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ELNode$Function", "setFunctionInfo", "(Ljavax/servlet/jsp/tagext/FunctionInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Validator$ValidateVisitor$1FVVisitor", "this$0", "Lorg/apache/jasper/compiler/Validator$ValidateVisitor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Validator$ValidateVisitor", "access$400", "(Lorg/apache/jasper/compiler/Validator$ValidateVisitor;Lorg/apache/jasper/compiler/ELNode$Function;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
