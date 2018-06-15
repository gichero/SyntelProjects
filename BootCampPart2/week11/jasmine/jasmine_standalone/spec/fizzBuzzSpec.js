describe("FizzBuzz Unit Tests", ()=>{
  it(`fizzBuzz must be defined`, ()=>{
    expect(fizzBuzz).toBeDefined();
  })
  it(`Should be 1 for passing fizzBuzz 1`, ()=>{
    expect(fizzBuzz(1)).toBe(1);
  })
  it(`Should be 2 for passing fizzBuzz 2`, ()=>{
    expect(fizzBuzz(2)).toBe(2);
  })
});