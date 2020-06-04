package asm.org.apache.commons.jcs.access.behavior;
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
public class IGroupCacheAccessDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/commons/jcs/access/behavior/IGroupCacheAccess", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/jcs/access/behavior/ICacheAccessManagement;", "java/lang/Object", new String[] { "org/apache/commons/jcs/access/behavior/ICacheAccessManagement" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFromGroup", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "(TK;Ljava/lang/String;)TV;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "putInGroup", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "(TK;Ljava/lang/String;TV;)V", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "putInGroup", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)V", "(TK;Ljava/lang/String;TV;Lorg/apache/commons/jcs/engine/behavior/IElementAttributes;)V", new String[] { "org/apache/commons/jcs/access/exception/CacheException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeFromGroup", "(Ljava/lang/Object;Ljava/lang/String;)V", "(TK;Ljava/lang/String;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGroupKeys", "(Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;)Ljava/util/Set<TK;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invalidateGroup", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
