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
public class ListOrderedMap$ListOrderedMapEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/map/ListOrderedMap$ListOrderedMapEntry", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/collections4/keyvalue/AbstractMapEntry<TK;TV;>;", "org/apache/commons/collections4/keyvalue/AbstractMapEntry", null);

classWriter.visitInnerClass("org/apache/commons/collections4/map/ListOrderedMap$ListOrderedMapEntry", "org/apache/commons/collections4/map/ListOrderedMap", "ListOrderedMapEntry", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parent", "Lorg/apache/commons/collections4/map/ListOrderedMap;", "Lorg/apache/commons/collections4/map/ListOrderedMap<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/map/ListOrderedMap;Ljava/lang/Object;)V", "(Lorg/apache/commons/collections4/map/ListOrderedMap<TK;TV;>;TK;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/keyvalue/AbstractMapEntry", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/map/ListOrderedMap$ListOrderedMapEntry", "parent", "Lorg/apache/commons/collections4/map/ListOrderedMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/Object;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/ListOrderedMap$ListOrderedMapEntry", "parent", "Lorg/apache/commons/collections4/map/ListOrderedMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/ListOrderedMap$ListOrderedMapEntry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/ListOrderedMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TV;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/map/ListOrderedMap$ListOrderedMapEntry", "parent", "Lorg/apache/commons/collections4/map/ListOrderedMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/ListOrderedMap", "decorated", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/map/ListOrderedMap$ListOrderedMapEntry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
