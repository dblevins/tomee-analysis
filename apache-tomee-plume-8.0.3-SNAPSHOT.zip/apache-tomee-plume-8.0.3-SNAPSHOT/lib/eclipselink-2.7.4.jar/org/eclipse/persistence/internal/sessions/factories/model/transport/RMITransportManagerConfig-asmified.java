package asm.org.eclipse.persistence.internal.sessions.factories.model.transport;
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
public class RMITransportManagerConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", null, "org/eclipse/persistence/internal/sessions/factories/model/transport/TransportManagerConfig", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "m_sendMode", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "m_discoveryConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/discovery/DiscoveryConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "m_jndiNamingServiceConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/JNDINamingServiceConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "m_rmiRegistryNamingServiceConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/RMIRegistryNamingServiceConfig;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/factories/model/transport/TransportManagerConfig", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSendMode", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", "m_sendMode", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSendMode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", "m_sendMode", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDiscoveryConfig", "(Lorg/eclipse/persistence/internal/sessions/factories/model/transport/discovery/DiscoveryConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", "m_discoveryConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/discovery/DiscoveryConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDiscoveryConfig", "()Lorg/eclipse/persistence/internal/sessions/factories/model/transport/discovery/DiscoveryConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", "m_discoveryConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/discovery/DiscoveryConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJNDINamingServiceConfig", "(Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/JNDINamingServiceConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", "m_jndiNamingServiceConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/JNDINamingServiceConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJNDINamingServiceConfig", "()Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/JNDINamingServiceConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", "m_jndiNamingServiceConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/JNDINamingServiceConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRMIRegistryNamingServiceConfig", "(Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/RMIRegistryNamingServiceConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", "m_rmiRegistryNamingServiceConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/RMIRegistryNamingServiceConfig;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRMIRegistryNamingServiceConfig", "()Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/RMIRegistryNamingServiceConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/factories/model/transport/RMITransportManagerConfig", "m_rmiRegistryNamingServiceConfig", "Lorg/eclipse/persistence/internal/sessions/factories/model/transport/naming/RMIRegistryNamingServiceConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
