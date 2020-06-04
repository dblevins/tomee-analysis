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
public class Generator$1DeclarationVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", null, "org/apache/jasper/compiler/Node$Visitor", null);

classWriter.visitOuterClass("org/apache/jasper/compiler/Generator", "generateDeclarations", "(Lorg/apache/jasper/compiler/Node$Nodes;)V");

classWriter.visitInnerClass("org/apache/jasper/compiler/Generator$1DeclarationVisitor", null, "DeclarationVisitor", 0);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$PageDirective", "org/apache/jasper/compiler/Node", "PageDirective", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Declaration", "org/apache/jasper/compiler/Node", "Declaration", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$CustomTag", "org/apache/jasper/compiler/Node", "CustomTag", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Visitor", "org/apache/jasper/compiler/Node", "Visitor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Nodes", "org/apache/jasper/compiler/Node", "Nodes", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "getServletInfoGenerated", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/jasper/compiler/Generator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/jasper/compiler/Generator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$Visitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "getServletInfoGenerated", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/jasper/compiler/Node$PageDirective;)V", null, new String[] { "org/apache/jasper/JasperException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "getServletInfoGenerated", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("info");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$PageDirective", "getAttributeValue", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "getServletInfoGenerated", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn("public java.lang.String getServletInfo() {");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "printil", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "pushIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn("return ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "printin", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "quote", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(";");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "popIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn("}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "printil", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "println", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/jasper/compiler/Node$Declaration;)V", null, new String[] { "org/apache/jasper/JasperException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "getJavaLine", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Declaration", "setBeginJavaLine", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Declaration", "getText", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "printMultiLn", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "println", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "this$0", "Lorg/apache/jasper/compiler/Generator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "access$000", "(Lorg/apache/jasper/compiler/Generator;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "getJavaLine", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Declaration", "setEndJavaLine", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/jasper/compiler/Node$CustomTag;)V", null, new String[] { "org/apache/jasper/JasperException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "useTagPlugin", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getAtSTag", "()Lorg/apache/jasper/compiler/Node$Nodes;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getAtSTag", "()Lorg/apache/jasper/compiler/Node$Nodes;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Nodes", "visit", "(Lorg/apache/jasper/compiler/Node$Visitor;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "visitBody", "(Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getAtETag", "()Lorg/apache/jasper/compiler/Node$Nodes;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getAtETag", "()Lorg/apache/jasper/compiler/Node$Nodes;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Nodes", "visit", "(Lorg/apache/jasper/compiler/Node$Visitor;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Generator$1DeclarationVisitor", "visitBody", "(Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
