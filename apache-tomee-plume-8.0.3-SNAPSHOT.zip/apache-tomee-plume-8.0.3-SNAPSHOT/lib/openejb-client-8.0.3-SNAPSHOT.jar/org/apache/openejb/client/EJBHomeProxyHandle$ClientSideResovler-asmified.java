package asm.org.apache.openejb.client;
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
public class EJBHomeProxyHandle$ClientSideResovlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/client/EJBHomeProxyHandle$ClientSideResovler", null, "java/lang/Object", new String[] { "org/apache/openejb/client/EJBHomeProxyHandle$Resolver" });

classWriter.visitInnerClass("org/apache/openejb/client/EJBHomeProxyHandle$ClientSideResovler", "org/apache/openejb/client/EJBHomeProxyHandle", "ClientSideResovler", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/client/EJBHomeProxyHandle$Resolver", "org/apache/openejb/client/EJBHomeProxyHandle", "Resolver", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolve", "(Lorg/apache/openejb/client/EJBHomeHandler;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBHomeHandler", "ejb", "Lorg/apache/openejb/client/EJBMetaDataImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/client/EJBHomeHandler", "createEJBHomeProxy", "()Lorg/apache/openejb/client/EJBHomeProxy;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "ejbHomeProxy", "Ljavax/ejb/EJBHome;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBHomeHandler", "ejb", "Lorg/apache/openejb/client/EJBMetaDataImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/EJBMetaDataImpl", "ejbHomeProxy", "Ljavax/ejb/EJBHome;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
