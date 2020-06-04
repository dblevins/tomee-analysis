package asm.org.apache.openejb.config.typed.util;
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
public class ServerContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/typed/util/ServerContext", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlRootElement;", true);
annotationVisitor0.visit("name", "ServerContext");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlAccessorType;", true);
annotationVisitor0.visitEnum("value", "Ljakarta/xml/bind/annotation/XmlAccessType;", "FIELD");
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "factory", "Lorg/apache/openejb/config/ConfigurationFactory;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlTransient;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "assembler", "Lorg/apache/openejb/assembler/classic/Assembler;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlTransient;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/ConfigurationFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/ConfigurationFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/typed/util/ServerContext", "factory", "Lorg/apache/openejb/config/ConfigurationFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/Assembler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/Assembler", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/typed/util/ServerContext", "assembler", "Lorg/apache/openejb/assembler/classic/Assembler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTransactionManager", "(Lorg/apache/openejb/config/sys/TransactionManager;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "factory", "Lorg/apache/openejb/config/ConfigurationFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/TransactionServiceInfo;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/ConfigurationFactory", "configureService", "(Lorg/apache/openejb/config/Service;Ljava/lang/Class;)Lorg/apache/openejb/assembler/classic/ServiceInfo;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/TransactionServiceInfo");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "assembler", "Lorg/apache/openejb/assembler/classic/Assembler;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/Assembler", "createTransactionManager", "(Lorg/apache/openejb/assembler/classic/TransactionServiceInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSecurityService", "(Lorg/apache/openejb/config/sys/SecurityService;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "factory", "Lorg/apache/openejb/config/ConfigurationFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/SecurityServiceInfo;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/ConfigurationFactory", "configureService", "(Lorg/apache/openejb/config/Service;Ljava/lang/Class;)Lorg/apache/openejb/assembler/classic/ServiceInfo;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/SecurityServiceInfo");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "assembler", "Lorg/apache/openejb/assembler/classic/Assembler;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/Assembler", "createSecurityService", "(Lorg/apache/openejb/assembler/classic/SecurityServiceInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResource", "(Lorg/apache/openejb/config/sys/Resource;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "factory", "Lorg/apache/openejb/config/ConfigurationFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/ResourceInfo;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/ConfigurationFactory", "configureService", "(Lorg/apache/openejb/config/Service;Ljava/lang/Class;)Lorg/apache/openejb/assembler/classic/ServiceInfo;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ResourceInfo");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "assembler", "Lorg/apache/openejb/assembler/classic/Assembler;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/Assembler", "createResource", "(Lorg/apache/openejb/assembler/classic/ResourceInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createService", "(Lorg/apache/openejb/config/sys/Service;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "factory", "Lorg/apache/openejb/config/ConfigurationFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/ServiceInfo;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/ConfigurationFactory", "configureService", "(Lorg/apache/openejb/config/Service;Ljava/lang/Class;)Lorg/apache/openejb/assembler/classic/ServiceInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "assembler", "Lorg/apache/openejb/assembler/classic/Assembler;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/Assembler", "createService", "(Lorg/apache/openejb/assembler/classic/ServiceInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContainer", "(Lorg/apache/openejb/config/sys/Container;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "factory", "Lorg/apache/openejb/config/ConfigurationFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/ContainerInfo;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/ConfigurationFactory", "configureService", "(Lorg/apache/openejb/config/Service;Ljava/lang/Class;)Lorg/apache/openejb/assembler/classic/ServiceInfo;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ContainerInfo");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "assembler", "Lorg/apache/openejb/assembler/classic/Assembler;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/Assembler", "createContainer", "(Lorg/apache/openejb/assembler/classic/ContainerInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createExternalContext", "(Lorg/apache/openejb/config/sys/JndiProvider;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "factory", "Lorg/apache/openejb/config/ConfigurationFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/JndiContextInfo;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/ConfigurationFactory", "configureService", "(Lorg/apache/openejb/config/Service;Ljava/lang/Class;)Lorg/apache/openejb/assembler/classic/ServiceInfo;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/JndiContextInfo");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/typed/util/ServerContext", "assembler", "Lorg/apache/openejb/assembler/classic/Assembler;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/Assembler", "createExternalContext", "(Lorg/apache/openejb/assembler/classic/JndiContextInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
