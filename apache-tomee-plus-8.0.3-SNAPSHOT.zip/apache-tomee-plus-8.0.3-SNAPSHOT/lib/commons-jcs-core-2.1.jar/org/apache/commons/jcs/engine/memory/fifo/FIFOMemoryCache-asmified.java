package asm.org.apache.commons.jcs.engine.memory.fifo;
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
public class FIFOMemoryCacheDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/engine/memory/fifo/FIFOMemoryCache", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/jcs/engine/memory/AbstractDoubleLinkedListMemoryCache<TK;TV;>;", "org/apache/commons/jcs/engine/memory/AbstractDoubleLinkedListMemoryCache", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/memory/AbstractDoubleLinkedListMemoryCache", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "adjustListForUpdate", "(Lorg/apache/commons/jcs/engine/behavior/ICacheElement;)Lorg/apache/commons/jcs/engine/memory/util/MemoryElementDescriptor;", "(Lorg/apache/commons/jcs/engine/behavior/ICacheElement<TK;TV;>;)Lorg/apache/commons/jcs/engine/memory/util/MemoryElementDescriptor<TK;TV;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/jcs/engine/memory/fifo/FIFOMemoryCache", "addFirst", "(Lorg/apache/commons/jcs/engine/behavior/ICacheElement;)Lorg/apache/commons/jcs/engine/memory/util/MemoryElementDescriptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "adjustListForGet", "(Lorg/apache/commons/jcs/engine/memory/util/MemoryElementDescriptor;)V", "(Lorg/apache/commons/jcs/engine/memory/util/MemoryElementDescriptor<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
