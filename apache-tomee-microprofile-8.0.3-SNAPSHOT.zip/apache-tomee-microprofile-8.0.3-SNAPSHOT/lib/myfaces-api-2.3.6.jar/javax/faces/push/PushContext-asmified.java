package asm.javax.faces.push;
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
public class PushContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/faces/push/PushContext", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENABLE_WEBSOCKET_ENDPOINT_PARAM_NAME", "Ljava/lang/String;", null, "javax.faces.ENABLE_WEBSOCKET_ENDPOINT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEBSOCKET_ENDPOINT_PORT_PARAM_NAME", "Ljava/lang/String;", null, "javax.faces.WEBSOCKET_ENDPOINT_PORT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "URI_PREFIX", "Ljava/lang/String;", null, "/javax.faces.push");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "send", "(Ljava/lang/Object;)Ljava/util/Set;", "(Ljava/lang/Object;)Ljava/util/Set<Ljava/util/concurrent/Future<Ljava/lang/Void;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "send", "(Ljava/lang/Object;Ljava/io/Serializable;)Ljava/util/Set;", "<S::Ljava/io/Serializable;>(Ljava/lang/Object;TS;)Ljava/util/Set<Ljava/util/concurrent/Future<Ljava/lang/Void;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "send", "(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Map;", "<S::Ljava/io/Serializable;>(Ljava/lang/Object;Ljava/util/Collection<TS;>;)Ljava/util/Map<TS;Ljava/util/Set<Ljava/util/concurrent/Future<Ljava/lang/Void;>;>;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
