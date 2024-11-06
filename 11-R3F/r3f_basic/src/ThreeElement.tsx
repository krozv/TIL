import * as THREE from "three";
import { useThree, useFrame } from "@react-three/fiber";
import { useRef } from "react";
import { useControls } from "leva";

export const ThreeElement = () => {
  const { size, gl, scene, camera } = useThree();
  // gl: renderer
  const boxRef = useRef<THREE.Mesh | null>(null);
  const box = useControls({
    // rotation: { value: 0, min: -360, max: 360, step: 1 },
  });
  useFrame((state, delta) => {
    // console.log(state); // state: webGL
    // console.log(delta); // delta: 랜더링된 시간
    // console.log(boxRef.current);
    // boxRef.current!.rotation.x += delta;
    // boxRef.current.position.y -= 0.01;
    // boxRef.current.scale.z += 0.01;
    // scene.position.x += 0.01;
  });
  //   console.log(scene);
  return (
    <>
      <directionalLight position={[5, 5, 5]} />
      <group position={[0, 0, 3]}>
        <mesh
          ref={boxRef}
          position={[0, 0, 0]}
          rotation={[
            THREE.MathUtils.degToRad(0),
            THREE.MathUtils.degToRad(0),
            0,
          ]}
        >
          <boxGeometry />
          <meshStandardMaterial color="red" />
        </mesh>
        <mesh
          ref={boxRef}
          position={[2, 0, 0]}
          rotation={[
            THREE.MathUtils.degToRad(0),
            THREE.MathUtils.degToRad(0),
            0,
          ]}
        >
          <boxGeometry />
          <meshStandardMaterial color="blue" />
        </mesh>
        <mesh
          ref={boxRef}
          position={[0, 2, 0]}
          rotation={[
            THREE.MathUtils.degToRad(0),
            THREE.MathUtils.degToRad(0),
            0,
          ]}
        >
          <boxGeometry />
          <meshStandardMaterial color="green" />
        </mesh>
      </group>
    </>
  );
};
