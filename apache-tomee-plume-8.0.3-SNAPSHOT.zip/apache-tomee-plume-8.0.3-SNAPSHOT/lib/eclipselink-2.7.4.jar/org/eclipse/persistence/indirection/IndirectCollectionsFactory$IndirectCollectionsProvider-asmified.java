package asm.org.eclipse.persistence.indirection;
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
public class IndirectCollectionsFactory$IndirectCollectionsProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/indirection/IndirectCollectionsFactory$IndirectCollectionsProvider", "org/eclipse/persistence/indirection/IndirectCollectionsFactory", "IndirectCollectionsProvider", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getListClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIndirectList", "(II)Lorg/eclipse/persistence/indirection/IndirectList;", "<E:Ljava/lang/Object;>(II)Lorg/eclipse/persistence/indirection/IndirectList<TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIndirectList", "(Ljava/util/Collection;)Lorg/eclipse/persistence/indirection/IndirectList;", "<E:Ljava/lang/Object;>(Ljava/util/Collection<+TE;>;)Lorg/eclipse/persistence/indirection/IndirectList<TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSetClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIndirectSet", "(IF)Lorg/eclipse/persistence/indirection/IndirectSet;", "<E:Ljava/lang/Object;>(IF)Lorg/eclipse/persistence/indirection/IndirectSet<TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIndirectSet", "(Ljava/util/Collection;)Lorg/eclipse/persistence/indirection/IndirectSet;", "<E:Ljava/lang/Object;>(Ljava/util/Collection<+TE;>;)Lorg/eclipse/persistence/indirection/IndirectSet<TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIndirectMap", "(IF)Lorg/eclipse/persistence/indirection/IndirectMap;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(IF)Lorg/eclipse/persistence/indirection/IndirectMap<TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createIndirectMap", "(Ljava/util/Map;)Lorg/eclipse/persistence/indirection/IndirectMap;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/Map<+TK;+TV;>;)Lorg/eclipse/persistence/indirection/IndirectMap<TK;TV;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
