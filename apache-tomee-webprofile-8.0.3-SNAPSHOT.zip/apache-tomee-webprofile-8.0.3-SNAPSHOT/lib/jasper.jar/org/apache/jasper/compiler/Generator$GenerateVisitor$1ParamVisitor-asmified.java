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
public class Generator$GenerateVisitor$1ParamVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", null, "org/apache/jasper/compiler/Node$Visitor", null);

classWriter.visitOuterClass("org/apache/jasper/compiler/Generator$GenerateVisitor", "printParams", "(Lorg/apache/jasper/compiler/Node;Ljava/lang/String;Z)V");

classWriter.visitInnerClass("org/apache/jasper/compiler/Generator$GenerateVisitor", "org/apache/jasper/compiler/Generator", "GenerateVisitor", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", null, "ParamVisitor", 0);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$ParamAction", "org/apache/jasper/compiler/Node", "ParamAction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Visitor", "org/apache/jasper/compiler/Node", "Visitor", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$JspAttribute", "org/apache/jasper/compiler/Node", "JspAttribute", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "separator", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/jasper/compiler/Generator$GenerateVisitor;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$Visitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "separator", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/jasper/compiler/Node$ParamAction;)V", null, new String[] { "org/apache/jasper/JasperException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator$GenerateVisitor", "access$300", "(Lorg/apache/jasper/compiler/Generator$GenerateVisitor;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(" + ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator$GenerateVisitor", "access$300", "(Lorg/apache/jasper/compiler/Generator$GenerateVisitor;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "separator", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator$GenerateVisitor", "access$300", "(Lorg/apache/jasper/compiler/Generator$GenerateVisitor;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn(" + ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator$GenerateVisitor", "access$300", "(Lorg/apache/jasper/compiler/Generator$GenerateVisitor;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$ParamAction", "getTextAttribute", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator", "quote", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", request.getCharacterEncoding())");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator$GenerateVisitor", "access$300", "(Lorg/apache/jasper/compiler/Generator$GenerateVisitor;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitLdcInsn("+ \"=\" + ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator$GenerateVisitor", "access$300", "(Lorg/apache/jasper/compiler/Generator$GenerateVisitor;)Lorg/apache/jasper/compiler/ServletWriter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "this$1", "Lorg/apache/jasper/compiler/Generator$GenerateVisitor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$ParamAction", "getValue", "()Lorg/apache/jasper/compiler/Node$JspAttribute;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/Generator$GenerateVisitor", "access$400", "(Lorg/apache/jasper/compiler/Generator$GenerateVisitor;Lorg/apache/jasper/compiler/Node$JspAttribute;ZLjava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/ServletWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("\"&\"");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/Generator$GenerateVisitor$1ParamVisitor", "separator", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
