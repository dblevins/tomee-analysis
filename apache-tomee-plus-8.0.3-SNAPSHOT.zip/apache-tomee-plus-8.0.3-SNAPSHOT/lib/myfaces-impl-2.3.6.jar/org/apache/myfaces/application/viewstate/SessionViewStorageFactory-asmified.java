package asm.org.apache.myfaces.application.viewstate;
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
public class SessionViewStorageFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/myfaces/application/viewstate/SessionViewStorageFactory", "<T:Lorg/apache/myfaces/application/viewstate/KeyFactory<TK;>;K:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyFactory", "Lorg/apache/myfaces/application/viewstate/KeyFactory;", "Lorg/apache/myfaces/application/viewstate/KeyFactory<TK;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/myfaces/application/viewstate/KeyFactory;)V", "(Lorg/apache/myfaces/application/viewstate/KeyFactory<TK;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/application/viewstate/SessionViewStorageFactory", "keyFactory", "Lorg/apache/myfaces/application/viewstate/KeyFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyFactory", "()Lorg/apache/myfaces/application/viewstate/KeyFactory;", "()Lorg/apache/myfaces/application/viewstate/KeyFactory<TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/application/viewstate/SessionViewStorageFactory", "keyFactory", "Lorg/apache/myfaces/application/viewstate/KeyFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSerializedViewCollection", "(Ljavax/faces/context/FacesContext;)Lorg/apache/myfaces/application/viewstate/SerializedViewCollection;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSerializedViewKey", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/myfaces/application/viewstate/SerializedViewKey;", "(Ljavax/faces/context/FacesContext;Ljava/lang/String;TK;)Lorg/apache/myfaces/application/viewstate/SerializedViewKey;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
