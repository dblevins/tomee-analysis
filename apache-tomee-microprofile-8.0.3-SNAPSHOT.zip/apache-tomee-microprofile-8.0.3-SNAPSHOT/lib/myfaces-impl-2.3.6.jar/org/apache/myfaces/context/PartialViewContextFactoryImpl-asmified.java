package asm.org.apache.myfaces.context;
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
public class PartialViewContextFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/context/PartialViewContextFactoryImpl", null, "javax/faces/context/PartialViewContextFactory", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_visitContextFactory", "Ljavax/faces/component/visit/VisitContextFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/context/PartialViewContextFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.faces.component.visit.VisitContextFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/faces/FactoryFinder", "getFactory", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/visit/VisitContextFactory");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/context/PartialViewContextFactoryImpl", "_visitContextFactory", "Ljavax/faces/component/visit/VisitContextFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPartialViewContext", "(Ljavax/faces/context/FacesContext;)Ljavax/faces/context/PartialViewContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/context/servlet/PartialViewContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/context/PartialViewContextFactoryImpl", "_visitContextFactory", "Ljavax/faces/component/visit/VisitContextFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/context/servlet/PartialViewContextImpl", "<init>", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/visit/VisitContextFactory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
