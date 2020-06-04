package asm.org.apache.openejb.server.rest;
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
public class RsHttpListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/server/rest/RsHttpListener", null, "java/lang/Object", new String[] { "org/apache/openejb/server/httpd/HttpListener" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deploySingleton", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljakarta/ws/rs/core/Application;Ljava/util/Collection;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljakarta/ws/rs/core/Application;Ljava/util/Collection<Ljava/lang/Object;>;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deployPojo", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljakarta/ws/rs/core/Application;Ljava/util/Collection;Ljavax/naming/Context;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/Collection;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class<*>;Ljakarta/ws/rs/core/Application;Ljava/util/Collection<Lorg/apache/openejb/Injection;>;Ljavax/naming/Context;Lorg/apache/webbeans/config/WebBeansContext;Ljava/util/Collection<Ljava/lang/Object;>;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deployEJB", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/BeanContext;Ljava/util/Collection;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openejb/BeanContext;Ljava/util/Collection<Ljava/lang/Object;>;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "undeploy", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deployApplication", "(Ljakarta/ws/rs/core/Application;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Map;Ljava/lang/ClassLoader;Ljava/util/Collection;Ljavax/naming/Context;Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", "(Ljakarta/ws/rs/core/Application;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection<Ljava/lang/Object;>;Ljava/util/Map<Ljava/lang/String;Lorg/apache/openejb/server/rest/EJBRestServiceInfo;>;Ljava/lang/ClassLoader;Ljava/util/Collection<Lorg/apache/openejb/Injection;>;Ljavax/naming/Context;Lorg/apache/webbeans/config/WebBeansContext;Lorg/apache/openejb/assembler/classic/util/ServiceConfiguration;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
