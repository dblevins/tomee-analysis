package asm.org.apache.jasper.el;
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
public class ExpressionImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_DEPRECATED, "org/apache/jasper/el/ExpressionImpl", null, "jakarta/servlet/jsp/el/Expression", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ve", "Ljakarta/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "factory", "Ljakarta/el/ExpressionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/el/ValueExpression;Ljakarta/el/ExpressionFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/el/Expression", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/el/ExpressionImpl", "ve", "Ljakarta/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/el/ExpressionImpl", "factory", "Ljakarta/el/ExpressionFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljakarta/servlet/jsp/el/VariableResolver;)Ljava/lang/Object;", null, new String[] { "jakarta/servlet/jsp/el/ELException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/el/ELContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/el/ELResolverImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ExpressionImpl", "factory", "Ljakarta/el/ExpressionFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/el/ELResolverImpl", "<init>", "(Ljakarta/servlet/jsp/el/VariableResolver;Ljakarta/el/ExpressionFactory;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/el/ELContextImpl", "<init>", "(Ljakarta/el/ELResolver;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/el/ExpressionImpl", "ve", "Ljakarta/el/ValueExpression;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ValueExpression", "getValue", "(Ljakarta/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
