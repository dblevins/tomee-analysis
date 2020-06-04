package asm.org.apache.openejb.resource.activemq;
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
public class ActiveMQ5Factory$ProvidedPersistenceAdapterPersistenceAdapterFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/activemq/ActiveMQ5Factory$ProvidedPersistenceAdapterPersistenceAdapterFactory", null, "java/lang/Object", new String[] { "org/apache/activemq/store/PersistenceAdapterFactory" });

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/ActiveMQ5Factory$ProvidedPersistenceAdapterPersistenceAdapterFactory", "org/apache/openejb/resource/activemq/ActiveMQ5Factory", "ProvidedPersistenceAdapterPersistenceAdapterFactory", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "instance", "Lorg/apache/activemq/store/PersistenceAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/PersistenceAdapter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/ActiveMQ5Factory$ProvidedPersistenceAdapterPersistenceAdapterFactory", "instance", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createPersistenceAdapter", "()Lorg/apache/activemq/store/PersistenceAdapter;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/ActiveMQ5Factory$ProvidedPersistenceAdapterPersistenceAdapterFactory", "instance", "Lorg/apache/activemq/store/PersistenceAdapter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
