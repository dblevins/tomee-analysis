package asm.org.apache.commons.collections4.map;
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
public class CompositeMap$MapMutatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/commons/collections4/map/CompositeMap$MapMutator", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Ljava/io/Serializable;", "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/commons/collections4/map/CompositeMap$MapMutator", "org/apache/commons/collections4/map/CompositeMap", "MapMutator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveCollision", "(Lorg/apache/commons/collections4/map/CompositeMap;Ljava/util/Map;Ljava/util/Map;Ljava/util/Collection;)V", "(Lorg/apache/commons/collections4/map/CompositeMap<TK;TV;>;Ljava/util/Map<TK;TV;>;Ljava/util/Map<TK;TV;>;Ljava/util/Collection<TK;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "put", "(Lorg/apache/commons/collections4/map/CompositeMap;[Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/apache/commons/collections4/map/CompositeMap<TK;TV;>;[Ljava/util/Map<TK;TV;>;TK;TV;)TV;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "putAll", "(Lorg/apache/commons/collections4/map/CompositeMap;[Ljava/util/Map;Ljava/util/Map;)V", "(Lorg/apache/commons/collections4/map/CompositeMap<TK;TV;>;[Ljava/util/Map<TK;TV;>;Ljava/util/Map<+TK;+TV;>;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
