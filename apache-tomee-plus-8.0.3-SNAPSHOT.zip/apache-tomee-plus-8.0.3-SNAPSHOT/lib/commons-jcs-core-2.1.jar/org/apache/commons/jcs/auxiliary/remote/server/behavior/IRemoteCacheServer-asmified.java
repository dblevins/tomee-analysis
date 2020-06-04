package asm.org.apache.commons.jcs.auxiliary.remote.server.behavior;
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
public class IRemoteCacheServerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/commons/jcs/auxiliary/remote/server/behavior/IRemoteCacheServer", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal<TK;TV;>;Lorg/apache/commons/jcs/engine/behavior/ICacheObserver;Lorg/apache/commons/jcs/engine/behavior/ICacheServiceAdmin;Ljava/rmi/Remote;", "java/lang/Object", new String[] { "org/apache/commons/jcs/engine/behavior/ICacheServiceNonLocal", "org/apache/commons/jcs/engine/behavior/ICacheObserver", "org/apache/commons/jcs/engine/behavior/ICacheServiceAdmin", "java/rmi/Remote" });

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
